#include <iostream>
#include <vector>
using namespace std;

// Метод для сортировки массива
void insertionSort(vector<int>& array) {
    // Проходим по всем элементам массива, начиная со второго
    for (int i = 1; i < array.size(); i++) {
        int key = array[i]; // Текущий элемент, который нужно вставить
        int j = i - 1; // Индекс предыдущего элемента
        
        // Перемещаем элементы array[0..i-1], которые больше key
        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j];
            j = j - 1;
        }
        array[j + 1] = key; // Вставляем key на правильное место
    }
}

// Метод для вывода массива
void printArray(const vector<int>& array) {
    for (int value : array) {
        cout << value << " ";
    }
    cout << endl;
}

// Основной метод для тестирования
int main() {
    vector<int> array = {12, 11, 13, 5, 6};
    
    cout << "Исходный массив: ";
    printArray(array);
    
    insertionSort(array);
    
    cout << "Отсортированный массив: ";
    printArray(array);
    
    return 0;
}