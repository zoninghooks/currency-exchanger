print "If I give you £1, how many Euro will you give me? ";
String str = System.console().readLine();
double euroOverPoundRatio = Double.parseDouble(str);
print "If I give you 1€, how many Sterling pounds will you give me? ";
str = System.console().readLine();
double poundOverEuroRatio = Double.parseDouble(str);
println "OK, now I know enough.";
boolean finished = false;
while (!finished) {
    println "";
    println "What would you like to do?";
    println "   1 - Exchange pounds into euro";
    println "   2 - Exchange euro into pounds";
    println "   0 - Exit the program";
    println "";
    print   "> ";
    str = System.console().readLine();
    int choice = Integer.parseInt(str);
    switch (choice) {
    case 1: 
	  break;
    case 2: 
	  break;
    case 0: 
	  finished = true;
	  break;
    default: 
	  println "Sorry, that is not a valid option";
    }	  
}
println "Exiting the program";
