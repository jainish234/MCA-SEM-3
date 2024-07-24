fun main()
{
    for (i in 1..5) {
        x = int(input ("Enter the first number : " ) )
        y= int(input ("Enter the second number : " ) )

        #printing the Menu
        print("What would you like to do? " )
        print("1. Addition")
        print("2.Substraction")
        print("3.Multiplication")
        print("4.Division")
        print("5.Exit")

        #Asking user about the arithmetic operation choice
        n = int(input("Enter your choice " (1-4) " ))

            #Calculation as per input from the user
                if n == 1 :
                    print("The result of addition : " , (x+y))
                elif n==2 :
                    print("The result of substraction : " , (x-y))
                elif n==3 :
                    print("The result of multiplication : " , (x*y))
                elif n==4 :
                    print("The result of division : " , (x/y))
                elif n==5:
                    print("Invalid Chice")
                else:
                    print("Default ")
    }
}