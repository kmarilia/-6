public class SelectionSort {
    public static void selectionSort(int[] arr) {
        // Проходим по всем элементам массива
        for (int i = 0; i < arr.length; i++) {
            // Предполагаем, что первый элемент - минимальный
            int minIndex = i;
            
            // Ищем минимальный элемент в оставшейся части массива
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Меняем найденный минимальный элемент с первым элементом
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    
    public static void main(String[] args) {
        // Создаем тестовый массив
        int[] testArray = {64, 25, 12, 22, 11};
        System.out.print("Исходный массив: ");
        for (int num : testArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Сортируем массив
        selectionSort(testArray);
        
        System.out.print("Отсортированный массив: ");
        for (int num : testArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}