
fun isOdd(num:Int):Boolean = num/2 == 0;

fun isPrime(num: Int):Boolean{
    var i = 2;
    var isPrime = false;
    while(i <= num/2){
        if(num % i==0){
            isPrime = true;
        }
        i++;
    }
    return isPrime;
}


fun isPalindrome (str:String):Boolean = str.reversed() == str;

fun main(){
    println(isOdd(2));
    println(isPrime(5));
    println(isPalindrome("abba"));
}
