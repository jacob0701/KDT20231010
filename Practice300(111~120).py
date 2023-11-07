
# 111
a = input("입력: ")
print(a*2)

# 112 
a = int(input("숫자를 입력하세요: "))
print(a+10)

# 113 
a = int(input("숫자를 입력하세요: "))
if a % 2 == 0:
    print("짝수")
else:
    print("홀수")

# 114 

a = int(input("숫자를 입력하세요: "))
if a + 20 <= 255:
    print(a + 20)
else:
    print(255)

# 115 

a = int(input("숫자를 입력하세요: "))
b = a - 20 

if 0 <= b <= 255:
    print(b)
elif b < 0:
    print(0)
else : 
    print(255)

# 116 

a = input("현재시간을 입력해 주세요: ")
print(len(a))
if a[3:] == "00":
    print("정각입니다.")
else:
    print("정각이 아닙니다.")

# 117 
fruit = ["사과" , "포도" , "홍시"]
a = str(input("좋아하는 과일은?: "))
if a in fruit: 
    print("정답입니다.") 
else: 
    print("오답입니다.")

# 118 

warn_investment_list = ["Microsoft", "Google", "Naver","Kakao", "SAMSUNG", "LG"]
a =  input("투자종목을 입력하세요: ")
if a in warn_investment_list:
    print("투자 경고 종목입니다.")
else:
    print("투자 경고 종목이 아닙니다.")

# 119

fruit = {"봄" : "딸기", "여름" : "토마토", "가을" : "사과"}
a = str(input("좋아하는 계절은: "))
if a in fruit.keys():
    print("정답입니다.")
else: 
    print("오답입니다.")

# 120

fruit = {"봄" : "딸기", "여름" : "토마토", "가을" : "사과"}
a = input("좋아하는 과일은: ")
if a in fruit.values():
    print("정답입니다.")
else: 
    print("오답입니다.")