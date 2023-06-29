package aula02;

public class data_types {

/*
Data Type	Size	Description
byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int	    4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char	2 bytes	Stores a single character/letter or ASCII values
 */
    private int myInt;
    private double myDouble;
    private float myFloat;
    private byte myByte = 0x01;
    private char myChar = 'a';
    private Object objeto1 = null;
    private boolean mybool = true;

    public void dataTypes(){
        myInt = 100;
        myDouble = 1.1234d;
        myFloat = 1.15f;
        myByte = 0x01;
        myChar = 'b';
    }

    public void printDataTypes(){
        this.dataTypes();
        System.out.printf("Inteiro: %d\n", myInt);
    }
}
