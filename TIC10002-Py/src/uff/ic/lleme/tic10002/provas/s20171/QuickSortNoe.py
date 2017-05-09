def swap(List, a, b):
    temp = List[a]
    List[a] = List[b]
    List[b] = temp

def quicksort(List, left, right):
    print(List)
    if left < right:
        q = partition(List, left, right)
        quicksort(List, left, q - 1)
        quicksort(List, q + 1, right)

def partition(List, left, right):
    x = List[right]
    i = left - 1
    for j in range(left, right):
        if List[j] <= x:
            i += 1
            swap(List, i, j)
    swap(List, i + 1, right)
    return i + 1

List = [7, 81, 14, 52, 31, 43, 4, 3, 7, 31]
print(List)
quicksort (List, 0, 9)
print(List)
