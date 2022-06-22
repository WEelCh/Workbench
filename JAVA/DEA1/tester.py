import subprocess


files = [
    'desc_100000.txt',
    'desc_150000.txt',
    'desc_200000.txt',
    'desc_250000.txt',
    'desc_300000.txt',
    'desc_350000.txt',
    'desc_400000.txt',
    'desc_450000.txt',
    'desc_500000.txt'
    ]

results = dict()

for file in files:
    print(f'Testing {file}')
    results[file] = []
    for i in range(10):
        result = subprocess.run([
                'java', 
                'InsertionSort', 
                f'Test/{file}'
                ], stdout=subprocess.PIPE
            ).stdout.decode('utf-8')
        results[file].append(result)
        print(i,result)

with open('data.txt', 'w') as data:
    for key in results.keys():
        data.write('\n' + key + '\n')
        for result in results[key]:
            data.write(result + '\n')