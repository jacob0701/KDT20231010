import random 

f = open("학생관리.txt","w")

students_name = []
students_number = []
number = random.randint(1,len(students_name))
students_number.append(number)

for i in range(7):
    while number in students_number:
        number = random.randint(1,len(students_name))
    students_number.append(number)

    f.write(f"{students_number[i]},{students_name[i]} \n")

f.close()
