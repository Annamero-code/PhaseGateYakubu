

def average (first_score ,second_score , third_score):
    average = (first_score + second_score + third_score) // 3
    

    if average >= 90 and average  <= 100:
	    grade1 = "A"

    elif average  >= 80 and average  <= 90:
	    grade1 = "B"

    elif average  >= 70 and average  <= 80:
	    grade1 = "C"

    elif average  >= 60 and average  <= 70:
	    grade1 = "D"

    else :
	    grade1 = "F"

    if average >= 90 and average  <= 100:
	    grade2 = "A"

    elif average  >= 80 and average  <= 90:
	    grade2 = "B"

    elif average  >= 70 and average  <= 80:
	    grade2 = "C"

    elif average  >= 60 and average  <= 70:
	    grade2 = "D"

    else :
	    grade2 = "F"

    if average >= 90 and average  <= 100:
	    grade3 = "A"

    elif average  >= 80 and average  <= 90:
	    grade3 = "B"

    elif average  >= 70 and average  <= 80:
	    grade3 = "C"

    elif average  >= 60 and average  <= 70:
	    grade3 = "D"

    else :
	    grade3 = "F"
	    
first_score = 90
second_score = 30
third_question = 50	    

print("average: ", average )
print("letter grade: ", grade1)


print("letter grade: ", grade2)


print("letter grade: ", grade3)





