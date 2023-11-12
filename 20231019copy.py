Student_Name = ["진","정국","RM","뷔","지민","제이홉","슈가"]


copy1 = Student_Name
copy2 = Student_Name.copy()

print(copy1)
print(copy2)

copy1[0] = "뉴진스"

print(id(copy1))
print(id(copy2))

print(copy1)
print(copy2)