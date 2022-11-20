for i in range(1,21):
    if i in (4,13):
        print(f'{i} is unlucky')
    else:
        print('even') if i % 2 == 0 else print('odd')