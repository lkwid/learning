print('How many kilometers did you cycle today?')
kms = float(input())
mls = round(kms/1.609344, 2)
print(f"Ok, you cycled {kms} kilometers is {mls} miles")
