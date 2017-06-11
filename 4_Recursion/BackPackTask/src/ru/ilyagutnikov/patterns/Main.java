package ru.ilyagutnikov.patterns;

public class Main {

    private static int[] items;

    private static int currentStartItem = 0;
    private static int targetWeight = 20;

    public static void main(String[] args) {

        items = new int[]{11, 8, 7, 6, 5};

        fillBackPack(targetWeight, currentStartItem);
    }

    public static void fillBackPack(int _targetWeight, int _itemPos) {

        int newTarget = 0;
        int newItemPos = 0;

        if (_itemPos > items.length-1) {

            noItems();
        }

        if (items[_itemPos] == _targetWeight) {

            System.out.println("Using item: " + items[_itemPos]);
            System.out.println("BINGO");
            return;
        }

        if (items[_itemPos] < _targetWeight) {

            newTarget = _targetWeight - items[_itemPos];
            newItemPos = _itemPos + 1;

            System.out.println("Using item: " + items[_itemPos] + " new target weight: " + newTarget);

            fillBackPack(newTarget, newItemPos);
        }

        if (items[_itemPos] > _targetWeight) {

            System.out.println("Item weight: " + items[_itemPos] + " is too much");

            if (_itemPos == (items.length-1)) {

                noItems();

            } else {

                newItemPos = _itemPos + 1;

                if (newTarget == 0) {

                    newTarget = _targetWeight;
                }

                fillBackPack(newTarget, newItemPos);
            }

        }
    }

    private static void noItems() {

        System.out.println("No more items");
        currentStartItem = currentStartItem + 1;

        if (currentStartItem == items.length-1) {

            System.out.println("NO COMBINATIONS");
            System.exit(0);
        }

        fillBackPack(targetWeight, currentStartItem);
    }
}
