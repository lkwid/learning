import sys


def find_min(num_list):
    min = sys.maxsize
    print(min)
    for num in num_list:
        if num < min:
            min = num
    print(min)


if __name__ == '__main__':
    num_list = [3, 6, 9, 2, 4, 8]
    find_min(num_list)