import java.io.*;
class Quiz
{
    static int takequiz(Question questions[]) throws IOException
    {
        int score = 0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<questions.length; i++) 
        {
            if (i!=0) 
            {
                System.out.println("********************************************************************************************************************************");
                System.out.println("Get ready for the next question."); 
            }
            System.out.println(questions[i].question);
            System.out.println("Press the correct option number(1, 2, 3 or 4)");
            int answer=Integer.parseInt(br.readLine());
            try
            {
                if (answer<1||answer>4) 
                {
                    throw new InvalidOptionNumException("Press the correct option number(1, 2, 3 or 4)");
                }
            }
            catch(InvalidOptionNumException ione)
            {
                System.out.println(ione.getMessage());
                answer=Integer.parseInt(br.readLine());
            }
            if(answer == questions[i].answer)
            {
                System.out.println("Your answer is absolutely correct!!");
                score++;
            }
            else
            {
                System.out.println("It is the wrong answer!!");
                System.out.println("The correct answer was "+questions[i].correct_answer);
            }
        }
        return score;
    }
    static void conclusion(String name, Long age, String add, Long tel)
    {
        System.out.println("********************************************************************************************************************************");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+add);
        System.out.println("Telephone/Mobile Number:"+tel);
    }
    public static void main(String args[]) throws IOException,InvalidTelNumException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Readfile r = new Readfile();
        Host h = new Host();
        int score;
        try
        {
        System.out.println("********************************************************************************************************************************");
        System.out.println("Hello!I am Ruban.");
        System.out.println("I will be guiding you through this quiz show");
        System.out.println("Enter your Name");
        String name=br.readLine();
        System.out.println("Enter your Age");
        Long age=Long.parseLong(br.readLine());
        System.out.println("Enter your Address");
        String add=br.readLine();
        System.out.println("Enter your Telephone/Mobile Number");
        Long tel=Long.parseLong(br.readLine());
        if (tel>9999999999L) 
        {
            throw new InvalidTelNumException("Enter 10 digit telephone number");
        }
        System.out.println("********************************************************************************************************************************");
        System.out.println("Please choose subjects from the given choices :");
        System.out.println("1. Science, Animals & Plants");
        System.out.println("2. Religion, Mythology & Social Studies");
        System.out.println("3. Sports, Literature & Famous Personalities");
        System.out.println("Please enter your choice number(1, 2 or 3)");
        int choice=Integer.parseInt(br.readLine());
        switch (choice)
        {
            case 1:try
                   {
                       h.rules();
                       r.openFile("Science.txt");
                       String q[] = r.readFile();
                       Question questions1[] = {new Question(q[0]+"\n"+q[1]+"\n"+q[2]+"\n"+q[3]+"\n"+q[4],1,q[1]), new Question(q[5]+"\n"+q[6]+"\n"+q[7]+"\n"+q[8]+"\n"+q[9],1,q[6]),  new Question(q[10]+"\n"+q[11]+"\n"+q[12]+"\n"+q[13]+"\n"+q[14],3,q[13]), new Question(q[15]+"\n"+q[16]+"\n"+q[17]+"\n"+q[18]+"\n"+q[19],1,q[16]), new Question(q[20]+"\n"+q[21]+"\n"+q[22]+"\n"+q[23]+"\n"+q[24],1,q[21]),
                        new Question(q[25]+"\n"+q[26]+"\n"+q[27]+"\n"+q[28]+"\n"+q[29],3,q[28]), new Question(q[30]+"\n"+q[31]+"\n"+q[32]+"\n"+q[33]+"\n"+q[34],3,q[33]), new Question(q[35]+"\n"+q[36]+"\n"+q[37]+"\n"+q[38]+"\n"+q[39],1,q[36]), new Question(q[40]+"\n"+q[41]+"\n"+q[42]+"\n"+q[43]+"\n"+q[44],1,q[41]), new Question(q[45]+"\n"+q[46]+"\n"+q[47]+"\n"+q[48]+"\n"+q[49],1,q[46]),
                        new Question(q[50]+"\n"+q[51]+"\n"+q[52]+"\n"+q[53]+"\n"+q[54],1,q[51]), new Question(q[55]+"\n"+q[56]+"\n"+q[57]+"\n"+q[58]+"\n"+q[59],3,q[58]), new Question(q[60]+"\n"+q[61]+"\n"+q[62]+"\n"+q[63]+"\n"+q[64],1,q[61]), new Question(q[65]+"\n"+q[66]+"\n"+q[67]+"\n"+q[68]+"\n"+q[69],2,q[67]), new Question(q[70]+"\n"+q[71]+"\n"+q[72]+"\n"+q[73]+"\n"+q[74],4,q[74]),
                        new Question(q[75]+"\n"+q[76]+"\n"+q[77]+"\n"+q[78]+"\n"+q[79],3,q[78]), new Question(q[80]+"\n"+q[81]+"\n"+q[82]+"\n"+q[83]+"\n"+q[84],1,q[81]), new Question(q[85]+"\n"+q[86]+"\n"+q[87]+"\n"+q[88]+"\n"+q[89],2,q[87]), new Question(q[90]+"\n"+q[91]+"\n"+q[92]+"\n"+q[93]+"\n"+q[94],3,q[93]), new Question(q[95]+"\n"+q[96]+"\n"+q[97]+"\n"+q[98]+"\n"+q[99],3,q[98]),
                        new Question(q[100]+"\n"+q[101]+"\n"+q[102]+"\n"+q[103]+"\n"+q[104],3,q[103]), new Question(q[105]+"\n"+q[106]+"\n"+q[107]+"\n"+q[108]+"\n"+q[109],1,q[106]), new Question(q[110]+"\n"+q[111]+"\n"+q[112]+"\n"+q[113]+"\n"+q[114],2,q[112]), new Question(q[115]+"\n"+q[116]+"\n"+q[117]+"\n"+q[118]+"\n"+q[119],3,q[118]), new Question(q[120]+"\n"+q[121]+"\n"+q[122]+"\n"+q[123]+"\n"+q[124],1,q[121])};
                       score = takequiz(questions1);
                       conclusion(name,age, add, tel);
                       h.prize_money(score);
                       r.closeFile();
                   }
                   catch(NumberFormatException ex)
                   {
                       System.out.println("Enter number as your option."); 
                   }
                   break;
            case 2:try
                   {            
                       h.rules();
                       r.openFile("Religion.txt");
                       String q[] = r.readFile();
                       Question questions2[] = {new Question(q[0]+"\n"+q[1]+"\n"+q[2]+"\n"+q[3]+"\n"+q[4],4,q[4]), new Question(q[5]+"\n"+q[6]+"\n"+q[7]+"\n"+q[8]+"\n"+q[9],1,q[6]),  new Question(q[10]+"\n"+q[11]+"\n"+q[12]+"\n"+q[13]+"\n"+q[14],4,q[14]), new Question(q[15]+"\n"+q[16]+"\n"+q[17]+"\n"+q[18]+"\n"+q[19],1,q[16]), new Question(q[20]+"\n"+q[21]+"\n"+q[22]+"\n"+q[23]+"\n"+q[24],2,q[22]),
                        new Question(q[25]+"\n"+q[26]+"\n"+q[27]+"\n"+q[28]+"\n"+q[29],1,q[26]), new Question(q[30]+"\n"+q[31]+"\n"+q[32]+"\n"+q[33]+"\n"+q[34],2,q[32]), new Question(q[35]+"\n"+q[36]+"\n"+q[37]+"\n"+q[38]+"\n"+q[39],4,q[39]), new Question(q[40]+"\n"+q[41]+"\n"+q[42]+"\n"+q[43]+"\n"+q[44],1,q[41]), new Question(q[45]+"\n"+q[46]+"\n"+q[47]+"\n"+q[48]+"\n"+q[49],3,q[48]),
                        new Question(q[50]+"\n"+q[51]+"\n"+q[52]+"\n"+q[53]+"\n"+q[54],1,q[51]), new Question(q[55]+"\n"+q[56]+"\n"+q[57]+"\n"+q[58]+"\n"+q[59],2,q[57]), new Question(q[60]+"\n"+q[61]+"\n"+q[62]+"\n"+q[63]+"\n"+q[64],3,q[63]), new Question(q[65]+"\n"+q[66]+"\n"+q[67]+"\n"+q[68]+"\n"+q[69],1,q[66]), new Question(q[70]+"\n"+q[71]+"\n"+q[72]+"\n"+q[73]+"\n"+q[74],2,q[72]),
                        new Question(q[75]+"\n"+q[76]+"\n"+q[77]+"\n"+q[78]+"\n"+q[79],1,q[76]), new Question(q[80]+"\n"+q[81]+"\n"+q[82]+"\n"+q[83]+"\n"+q[84],1,q[81]), new Question(q[85]+"\n"+q[86]+"\n"+q[87]+"\n"+q[88]+"\n"+q[89],3,q[88]), new Question(q[90]+"\n"+q[91]+"\n"+q[92]+"\n"+q[93]+"\n"+q[94],3,q[93]), new Question(q[95]+"\n"+q[96]+"\n"+q[97]+"\n"+q[98]+"\n"+q[99],1,q[96]),
                        new Question(q[100]+"\n"+q[101]+"\n"+q[102]+"\n"+q[103]+"\n"+q[104],2,q[102]), new Question(q[105]+"\n"+q[106]+"\n"+q[107]+"\n"+q[108]+"\n"+q[109],1,q[106]), new Question(q[110]+"\n"+q[111]+"\n"+q[112]+"\n"+q[113]+"\n"+q[114],2,q[112]), new Question(q[115]+"\n"+q[116]+"\n"+q[117]+"\n"+q[118]+"\n"+q[119],1,q[116]), new Question(q[120]+"\n"+q[121]+"\n"+q[122]+"\n"+q[123]+"\n"+q[124],4,q[124])};
                       score = takequiz(questions2);
                       conclusion(name,age, add, tel);
                       h.prize_money(score);
                       r.closeFile();                  
                   }
                   catch(NumberFormatException ex)
                   {
                       System.out.println("Enter number as your option."); 
                   }
                   break;
            case 3:try
                   {
                   h.rules();
                   r.openFile("Sports.txt");
                   String q[] = r.readFile();
                   Question questions3[] = {new Question(q[0]+"\n"+q[1]+"\n"+q[2]+"\n"+q[3]+"\n"+q[4],4,q[4]), new Question(q[5]+"\n"+q[6]+"\n"+q[7]+"\n"+q[8]+"\n"+q[9],3,q[8]),  new Question(q[10]+"\n"+q[11]+"\n"+q[12]+"\n"+q[13]+"\n"+q[14],2,q[12]), new Question(q[15]+"\n"+q[16]+"\n"+q[17]+"\n"+q[18]+"\n"+q[19],4,q[19]), new Question(q[20]+"\n"+q[21]+"\n"+q[22]+"\n"+q[23]+"\n"+q[24],2,q[22]),
                    new Question(q[25]+"\n"+q[26]+"\n"+q[27]+"\n"+q[28]+"\n"+q[29],2,q[27]), new Question(q[30]+"\n"+q[31]+"\n"+q[32]+"\n"+q[33]+"\n"+q[34],4,q[34]), new Question(q[35]+"\n"+q[36]+"\n"+q[37]+"\n"+q[38]+"\n"+q[39],3,q[38]), new Question(q[40]+"\n"+q[41]+"\n"+q[42]+"\n"+q[43]+"\n"+q[44],1,q[41]), new Question(q[45]+"\n"+q[46]+"\n"+q[47]+"\n"+q[48]+"\n"+q[49],1,q[46]),
                    new Question(q[50]+"\n"+q[51]+"\n"+q[52]+"\n"+q[53]+"\n"+q[54],3,q[53]), new Question(q[55]+"\n"+q[56]+"\n"+q[57]+"\n"+q[58]+"\n"+q[59],1,q[56]), new Question(q[60]+"\n"+q[61]+"\n"+q[62]+"\n"+q[63]+"\n"+q[64],2,q[62]), new Question(q[65]+"\n"+q[66]+"\n"+q[67]+"\n"+q[68]+"\n"+q[69],2,q[67]), new Question(q[70]+"\n"+q[71]+"\n"+q[72]+"\n"+q[73]+"\n"+q[74],4,q[74]),
                    new Question(q[75]+"\n"+q[76]+"\n"+q[77]+"\n"+q[78]+"\n"+q[79],1,q[76]), new Question(q[80]+"\n"+q[81]+"\n"+q[82]+"\n"+q[83]+"\n"+q[84],1,q[81]), new Question(q[85]+"\n"+q[86]+"\n"+q[87]+"\n"+q[88]+"\n"+q[89],1,q[86]), new Question(q[90]+"\n"+q[91]+"\n"+q[92]+"\n"+q[93]+"\n"+q[94],3,q[93]), new Question(q[95]+"\n"+q[96]+"\n"+q[97]+"\n"+q[98]+"\n"+q[99],1,q[96]),
                    new Question(q[100]+"\n"+q[101]+"\n"+q[102]+"\n"+q[103]+"\n"+q[104],2,q[102]), new Question(q[105]+"\n"+q[106]+"\n"+q[107]+"\n"+q[108]+"\n"+q[109],4,q[109]), new Question(q[110]+"\n"+q[111]+"\n"+q[112]+"\n"+q[113]+"\n"+q[114],4,q[114]), new Question(q[115]+"\n"+q[116]+"\n"+q[117]+"\n"+q[118]+"\n"+q[119],2,q[117]), new Question(q[120]+"\n"+q[121]+"\n"+q[122]+"\n"+q[123]+"\n"+q[124],4,q[124])};
                   score = takequiz(questions3);
                   conclusion(name,age, add, tel);
                   h.prize_money(score);
                   r.closeFile();               
                   }
                   catch(NumberFormatException ex)
                   {
                   System.out.println("Enter number as your option."); 
                   }
                   break;
            default:System.out.println("Please enter your choice number(1, 2 or 3) correctly.");
        }
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Enter number as your option."); 
        }
    }
}