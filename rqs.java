import java.io.*;
class rqs
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*                         * * * * * * * *  *               * * * *       * * * *             *       *          * * * * * * * ");
        System.out.println(" *                       *  *              *             *             *         *          * *     * *         *             ");
        System.out.println("  *                     *   *              *            *             *           *        *   *   *   *        *             ");
        System.out.println("   *                   *    *              *            *             *           *       *     * *     *       *             ");
        System.out.println("    *                 *     * * * * *      *            *             *           *      *       *       *      * * * * *     ");
        System.out.println("     *       *       *      *              *            *             *           *     *                 *     *             ");
        System.out.println("      *     * *     *       *              *            *             *           *    *                   *    *             ");
        System.out.println("       *   *   *   *        *              *            *             *           *   *                     *   *             ");
        System.out.println("        * *     * *         *              *             *             *         *   *                       *  *             ");
        System.out.println("         *       *          * * * * * * *  * * * * * *     * * * *       * * * *    *                         * * * * * * * * ");
        System.out.println("                                                                                                                              ");
        System.out.println("                                                * * * * * * * * *     * * * *                                                 ");
        System.out.println("                                                        *           *         *                                               ");
        System.out.println("                                                        *          *           *                                              ");
        System.out.println("                                                        *          *           *                                              ");
        System.out.println("                                                        *          *           *                                              ");
        System.out.println("                                                        *          *           *                                              ");
        System.out.println("                                                        *          *           *                                              ");
        System.out.println("                                                        *          *           *                                              ");
        System.out.println("                                                        *           *         *                                               ");
        System.out.println("                                                        *             * * * *                                                 ");
        System.out.println("                                                                                                                              ");
        System.out.println("* * * * *                                                  * * * *                         * * *                              ");
        System.out.println("*         *                                              *         *                     *       *                            ");
        System.out.println("*          *                                            *           *                   *                                     ");
        System.out.println("*         *                                             *           *                   *                                     ");
        System.out.println("* * * * *           *                      *            *           *       *            *          *                         ");
        System.out.println("* *                 *                       *           *    *      *                      * * *    *                         ");
        System.out.println("*   *         *   * *       * *     *****  *   ***      *     *     * *   * * *****              *  *       * *  *           *");
        System.out.println("*     *       *   * * * *  *   *    *   * *   *         *      *    * *   * *    *                * * * *  *   *  *         * ");
        System.out.println("*       *     *   * *    * *   *    *   *      ***      *       *   * *   * *   *                 * *    * *   *   *   *   *  ");
        System.out.println("*         *   *   * *    * *   *  * *   *         *      *       * *  *   * *  *         *       *  *    * *   *    * * * *   ");
        System.out.println("*           *  ***  * * *   * * **  *   *      ***         * * * *     ***  * *****        * * *    *    *  * *      *   *    "); 
        System.out.println("                                                                  *                                                           ");
        System.out.println(" ");
        System.out.println(" ");
        try
        {
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
                   int c1=0;
                   System.out.println("Rules and Regulations:");
                   System.out.println("Answer across 25 questions");
                   System.out.println("Start with the 1st question and once you have decided your final answer(and you are absolutely sure of it...)");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   System.out.println("After answering all 25 questions, you would be given your total score, percentage and gifts as per your percentage.");
                   System.out.println("Are you ready?");
                   System.out.println("You should be.");
                   System.out.println("Best of luck!");
                   System.out.println("Q1.Which fuel is commonly used in nulear reactors?");
                   System.out.println("1.Uranium     2.Helium");
                   System.out.println("3.Plutonium   4.Magnesium");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a1=Integer.parseInt(br.readLine());
                   if(a1==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Uranium");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q2.Which human body system is attacked by the AIDS Virus?");
                   System.out.println("1.Immune System      2.Nervous System");
                   System.out.println("3.Digestive System   4.Circulatory System");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a2=Integer.parseInt(br.readLine());
                   if(a2==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Immune System");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q3.Which disease is known as 'White Death'?");
                   System.out.println("1.Cancer         2.Asthma");
                   System.out.println("3.Tuberculosis   4.Leukemia");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a3=Integer.parseInt(br.readLine());
                   if(a3==3)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.Tuberculosis");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q4.What is warming of the planet due to carbon dioxide and other gases called?");
                   System.out.println("1.Greenhouse Effect   2.Nuclear Fission");
                   System.out.println("3.Pollution           4.Big Bang");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a4=Integer.parseInt(br.readLine());
                   if(a4==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Greenhouse Effect");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q5.Which instrument is implanted in the heart of humans to make the heart beat steady?");
                   System.out.println("1.Pacemaker     2.Cardiometer");
                   System.out.println("3.Cardioscope   4.Voltameter");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a5=Integer.parseInt(br.readLine());
                   if(a5==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Pacemaker");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q6.Pure gold is __ carat gold.");
                   System.out.println("1.12   2.20");
                   System.out.println("3.24   4.22");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a6=Integer.parseInt(br.readLine());
                   if(a6==3)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.24");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q7.Which gas is used in laughing gas?");
                   System.out.println("1.Carbon Dioxide   2.Sulphur Dioxide");
                   System.out.println("3.Nitrous Oxide    4.Oxygen");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a7=Integer.parseInt(br.readLine());
                   if(a7==3)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.Nitrous Oxide");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q8.Who invented Atom Bomb?");
                   System.out.println("1.Otto Hahn   2.Torricelli");
                   System.out.println("3.C V Raman   4.Thomson");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a8=Integer.parseInt(br.readLine());
                   if(a8==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Otto Hahn");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q9.Dialysis is used for a patient suffering from");
                   System.out.println("1.Kidney trouble   2.Liver trouble");
                   System.out.println("3.Lungs trouble    4.Heart trouble");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a9=Integer.parseInt(br.readLine());
                   if(a9==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Kidney trouble");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q10.Plaster of Paris is made from");
                   System.out.println("1.Gypsum      2.Bauxite");
                   System.out.println("3.Limestone   4.Silicon");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a10=Integer.parseInt(br.readLine());
                   if(a10==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Gypsum");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q11.Which are the longest and the smallest bones in the human body?");
                   System.out.println("1.Longest-Femur, Shortest-Stapes    2.Longest-Ribs, Shortest-Joints");
                   System.out.println("3.Longest-Ulna, Smallest-Rib bone   4.None of these");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a11=Integer.parseInt(br.readLine());
                   if(a11==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Longest-Femur, Shortest-Stapes");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q12.Which is the largest of all the deer?");
                   System.out.println("1.Reindeer   2.Spotted Deer");
                   System.out.println("3.Moose      4.Deer");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a12=Integer.parseInt(br.readLine());
                   if(a12==3)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.Moose");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q13.To which era did the dinosaurs belong?");
                   System.out.println("1.Mesozoic Era   2.Pre-Stone Age");
                   System.out.println("3.Metal Age      4.None of these");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a13=Integer.parseInt(br.readLine());
                   if(a13==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Mesozoic Era");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q14.Which of the following is not a fruit?");
                   System.out.println("1.Coconut    2.Almond");
                   System.out.println("3.Chilgoza   4.Peanut");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a14=Integer.parseInt(br.readLine());
                   if(a14==2)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 2.Almond");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q15.The population of which of the following is maximum on Earth?");
                   System.out.println("1.Reptiles   2.Fish");
                   System.out.println("3.Birds      4.Insects");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a15=Integer.parseInt(br.readLine());
                   if(a15==4)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 4.Insects");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q16.The blood sucking organisms are");
                   System.out.println("1.Hookworms   2.Earthworms");
                   System.out.println("3.Leeches     4.Pin Worms");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a16=Integer.parseInt(br.readLine());
                   if(a16==3)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.Leeches");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q17.Bamboo is a");
                   System.out.println("1.Grass   2.Herb");
                   System.out.println("3.Shrub   4.Tree");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a17=Integer.parseInt(br.readLine());
                   if(a17==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Grass");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q18.The portion of potato plant we eat is a modified");
                   System.out.println("1.Root   2.Stem");
                   System.out.println("3.Leaf   4.Fruit");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a18=Integer.parseInt(br.readLine());
                   if(a18==2)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 2.Stem");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q19.How many milk teeth are there in human beings?");
                   System.out.println("1.30   2.12");
                   System.out.println("3.20   4.28");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a19=Integer.parseInt(br.readLine());
                   if(a19==3)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.20");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q20.Food is mainly digested in");
                   System.out.println("1.Mouth             2.Liver");
                   System.out.println("3.Small Intestine   4.Large Intestine");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a20=Integer.parseInt(br.readLine());
                   if(a20==3)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.Small Intestine");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q21.Halley's comet can be seen after every");
                   System.out.println("1.72 years   2.74 years");
                   System.out.println("3.76 years   4.70 years");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a21=Integer.parseInt(br.readLine());
                   if(a21==3)
                   {
                       
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.76 years");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q22.Telephone was invented by");
                   System.out.println("1.Alexander Graham Bell   2.Baird");
                   System.out.println("3.Stevenson               4.Newton");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a22=Integer.parseInt(br.readLine());
                   if(a22==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Alexander Graham Bell");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q23.Red colour of human blood is due to");
                   System.out.println("1.Iron     2.Haemoglobin");
                   System.out.println("3.Plasma   4.Serum");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a23=Integer.parseInt(br.readLine());
                   if(a23==2)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 2.Haemoglobin");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q24.The pulse rate of a healthy human being is");
                   System.out.println("1.80 beats/minute   2.100 beats/minute");
                   System.out.println("3.72 beats/minute   4.56 beats/minute");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a24=Integer.parseInt(br.readLine());
                   if(a24==3)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.72 beats/minute");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q25.The first life originated in/on");
                   System.out.println("1.Water   2.Air");
                   System.out.println("3.Land    4.Mountain");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int a25=Integer.parseInt(br.readLine());
                   if(a25==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c1++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Water");
                   }
                   System.out.println("Name:"+name);
                   System.out.println("Age:"+age);
                   System.out.println("Address:"+add);
                   System.out.println("Telephone/Mobile Number:"+tel);
                   System.out.println("Total Score="+c1+"/25");
                   int n=c1;
                   System.out.println("Percentage="+(c1*4)+"%");
                   int p;
                   if(n==0)
                   {
                   System.out.println("Better Luck Next Time.");  
                   }
                   else
                   {
                   if(1<=n&&n<=2)
                   {
                   p=5000;
                   }
                   else if(2<n&&n<5)
                   {
                   p=10000;
                   }
                   else if(4<n&&n<7)
                   {
                   p=20000;
                   }
                   else if(6<n&&n<9)
                   {
                   p=40000;
                   }
                   else if(8<n&&n<11)
                   {
                   p=80000;
                   }
                   else if(10<n&&n<13)
                   {
                   p=160000;
                   }
                   else if(12<n&&n<15)
                   {
                   p=320000;
                   }
                   else if(14<n&&n<17)
                   {
                   p=640000;
                   }
                   else if(16<n&&n<19)
                   {
                   p=1250000;
                   }
                   else if(18<n&&n<22)
                   {
                   p=2500000;
                   }
                   else if(21<n&&n<25)
                   {
                   p=5000000;
                   }
                   else 
                   {
                   p=10000000;
                   }
                   System.out.println("Congratulations!! You have won Rs."+p);
                   }
                   }
                   catch(NumberFormatException ex)
                   {
                   System.out.println("Enter number as your option."); 
                   }
                   break;
            case 2:try
                   {
                   int c2=0;
                   System.out.println("Rules and Regulations:");
                   System.out.println("Answer across 25 questions");
                   System.out.println("Start with the 1st question and once you have decided your final answer(and you are absolutely sure of it...)");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   System.out.println("After answering all 25 questions, you would be given your total score, percentage and gifts as per your percentage.");
                   System.out.println("Are you ready?");
                   System.out.println("You should be.");
                   System.out.println("Best of luck!");
                   System.out.println("Q1.Who wrote the Mahabharata?");
                   System.out.println("1.Tulsidas   2.Kashyap");
                   System.out.println("3.Brahma     4.Veda Vyasa");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b1=Integer.parseInt(br.readLine());
                   if(b1==4)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 4.Veda Vyasa");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q2.Which faith is celebrated in the world without ceremonies, clergy, etc.?");
                   System.out.println("1.Baha'i    2.Buddhism");
                   System.out.println("3.Jainism   4.Hinduism");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b2=Integer.parseInt(br.readLine());
                   if(b2==1)
                   {       
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Baha'i");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q3.What does the word 'Azan' in Islam mean?");
                   System.out.println("1.Fasting   2.Namaz");
                   System.out.println("3.Prayer    4.Call to pray");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b3=Integer.parseInt(br.readLine());
                   if(b3==4)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 4.Call to pray");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q4.Which of these is the oldest veda?");
                   System.out.println("1.Rig Veda     2.Sam Veda");
                   System.out.println("3.Yajur Veda   4.Atharva Veda");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b4=Integer.parseInt(br.readLine());
                   if(b4==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Rig Veda");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q5.Name the Sun God in Greek mythology.");
                   System.out.println("1.Aphrodite   2.Helios");
                   System.out.println("3.Zeus        4.Vayu");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b5=Integer.parseInt(br.readLine());
                   if(b5==2)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 2.Helios");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q6.On which day do the Christians commemorate to the death of Jesus?");
                   System.out.println("1.Good Friday   2.Easter");
                   System.out.println("3.Christmas     4.Lent");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b6=Integer.parseInt(br.readLine());
                   if(b6==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Good Friday");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q7.Who sacrificed her son in Mahabharata?");
                   System.out.println("1.Kunti      2.Ganga");
                   System.out.println("3.Gandhari   4.Madri");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b7=Integer.parseInt(br.readLine());
                   if(b7==2)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 2.Ganga");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q8.Which herb was used to revive Lakshmana in Mahabharata?");
                   System.out.println("1.Tulsi       2.Neem");
                   System.out.println("3.Bahi Buti   4.Sanjeevkarni");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b8=Integer.parseInt(br.readLine());
                   if(b8==4)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 4.Sanjeevkarni");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q9.The official residence of the Pope is in");
                   System.out.println("1.Vatican City   2.Rome");
                   System.out.println("3.London         4.Paris");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b9=Integer.parseInt(br.readLine());
                   if(b9==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Vatican City");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q10.In Hindu mythology, who is the foster mother of Lord Krishna?");
                   System.out.println("1.Subhadra   2.Devaki");
                   System.out.println("3.Yashoda    4.None of these");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b10=Integer.parseInt(br.readLine());
                   if(b10==3)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.Yashoda");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q11.Which Sikh Guru built the Golden Temple");
                   System.out.println("1.Guru Arjan Dev    2.Guru Gobind Singh");
                   System.out.println("3.Guru Harikishan   4.Guru Angad Dev");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b11=Integer.parseInt(br.readLine());
                   if(b11==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Guru Arjan Dev");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q12.Who is the founder of the Mughal Empire in India?");
                   System.out.println("1.Akbar       2.Babur");
                   System.out.println("3.Aurangzeb   4.Iltutmish");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b12=Integer.parseInt(br.readLine());
                   if(b12==2)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 2.Babur");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q13.Who was defeated by the British Forces in 1757?");
                   System.out.println("1.Hyder-Ali          2.Bahadur Shah");
                   System.out.println("3.Siraj-ud-Daullah   4.Tipu Sultan");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b13=Integer.parseInt(br.readLine());
                   if(b13==3)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.Siraj-ud-Daullah");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q14.Name the religious book of the Parsis");
                   System.out.println("1.Zend Avesta   2.Old Testament");
                   System.out.println("3.Bible         4.Koran");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b14=Integer.parseInt(br.readLine());
                   if(b14==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Zend Avesta");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q15.Who introduced Christianity in India(around 50 AD)?");
                   System.out.println("1.St. Francis Xavier   2.St. Thomas");
                   System.out.println("3.Martin Luther        4.St. Peter");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b15=Integer.parseInt(br.readLine());
                   if(b15==2)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 2.St. Thomas");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q16.Who is the founder of Sikhism?");
                   System.out.println("1.Guru Nanak Dev      2.Guru Tej Bahadur");
                   System.out.println("3.Guru Gobind Singh   4.Guru Arjan Dev");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b16=Integer.parseInt(br.readLine());
                   if(b16==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Guru Nanak Dev");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q17.Which war changed the life of King Ashoka?");
                   System.out.println("1.Kalinga   2.Haldighati");
                   System.out.println("3.Panipat   4.Buxar");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b17=Integer.parseInt(br.readLine());
                   if(b17==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Kalinga");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q18.Who among the following Mughal rulers has been called the 'Prince of Builders'?");
                   System.out.println("1.Akbar        2.Jahangir"); 
                   System.out.println("3.Shah Jahan   4.Babur");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b18=Integer.parseInt(br.readLine());
                   if(b18==3)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.Shah Jahan");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q19.Who among the following fought the Battle of Plassey?");
                   System.out.println("1.Lord Curzon   2.Lord Ripon");
                   System.out.println("3.Lord Clive    4.Lord Bentinck");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b19=Integer.parseInt(br.readLine());
                   if(b19==3)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.Lord Clive");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q20.Who among the following is known as the 'Father of Modern India'?");
                   System.out.println("1.Raja Ram Mohan Roy   2.Rabindranath Tagore");
                   System.out.println("3.Dwarkanath Tagore    4.None of these");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b20=Integer.parseInt(br.readLine());
                   if(b20==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Raja Ram Mohan Roy");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q21.Which is the smallest planet in the universe?");
                   System.out.println("1.Neptune   2.Earth");
                   System.out.println("3.Saturn    4.Jupiter");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b21=Integer.parseInt(br.readLine());
                   if(b21==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Neptune");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q22.Can you name the state with the maximum number of districts?");
                   System.out.println("1.Uttar Pradesh   2.Madhya Pradesh");
                   System.out.println("3.Bihar           4.Maharashtra");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b22=Integer.parseInt(br.readLine());
                   if(b22==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Uttar Pradesh");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q23.When does a lunar eclipse occur?");
                   System.out.println("1.New Moon    2.Full Moon");
                   System.out.println("3.Half Moon   4.Quarter Moon");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b23=Integer.parseInt(br.readLine());
                   if(b23==2)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 2.Full Moon");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q24.The only diamond mine located in India is in");
                   System.out.println("1.Madhya Pradesh   2.Karnataka");
                   System.out.println("3.Maharashtra      4.Rajasthan");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b24=Integer.parseInt(br.readLine());
                   if(b24==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Madhya Pradesh");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q25.Which of the following Hindu pilgrimage is not located in the banks of River Ganga");
                   System.out.println("1.Haridwar   2.Allahabad");
                   System.out.println("3.Varanasi   4.Mathura");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int b25=Integer.parseInt(br.readLine());
                   if(b25==4)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c2++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 4.Mathura");
                   }
                   System.out.println("Name:"+name);
                   System.out.println("Age:"+age);
                   System.out.println("Address:"+add);
                   System.out.println("Telephone/Mobile Number:"+tel);
                   System.out.println("Total Score="+c2+"/25");
                   int n2=c2;
                   System.out.println("Percentage="+(c2*4)+"%");
                   int p2;
                   if(n2==0)
                   {
                   System.out.println("Better Luck Next Time.");  
                   }
                   else
                   {
                   if(1<=n2&&n2<=2)
                   {
                   p2=5000;
                   }
                   else if(2<n2&&n2<5)
                   {
                   p2=10000;
                   }
                   else if(4<n2&&n2<7)
                   {
                   p2=20000;
                   }
                   else if(6<n2&&n2<9)
                   {
                   p2=40000;
                   }
                   else if(8<n2&&n2<11)
                   {
                   p2=80000;
                   }
                   else if(10<n2&&n2<13)
                   {
                   p2=160000;
                   }
                   else if(12<n2&&n2<15)
                   {
                   p2=320000;
                   }
                   else if(14<n2&&n2<17)
                   {
                   p2=640000;
                   }
                   else if(16<n2&&n2<19)
                   {
                   p2=1250000;
                   }
                   else if(18<n2&&n2<22)
                   {
                   p2=2500000;
                   }
                   else if(21<n2&&n2<25)
                   {
                   p2=5000000;
                   }
                   else 
                   {
                   p2=10000000;
                   }
                   System.out.println("Congratulations!! You have won Rs."+p2);
                   }
                   }
                   catch(NumberFormatException ex)
                   {
                   System.out.println("Enter number as your option."); 
                   }
                   break;
            case 3:try
                   {
                   int c3s=0;
                   System.out.println("Rules and Regulations:");
                   System.out.println("Answer across 25 questions");
                   System.out.println("Start with the 1st question and once you have decided your final answer(and you are absolutely sure of it...)");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   System.out.println("After answering all 25 questions, you would be given your total score, percentage and gifts as per your percentage.");
                   System.out.println("Are you ready?");
                   System.out.println("You should be.");
                   System.out.println("Best of luck!");
                   System.out.println("Q1.With which sport would you link the Wimbledon?");
                   System.out.println("1.Cricket   2.Football");
                   System.out.println("3.Hockey    4.Lawn Tennis");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c1s=Integer.parseInt(br.readLine());
                   if(c1s==4)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 4.Lawn Tennis");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q2.The symbol of Olympic Games has");
                   System.out.println("1.8 rings   2.6 rings");
                   System.out.println("3.5 rings   4.4 rings");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c2s=Integer.parseInt(br.readLine());
                   if(c2s==3)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.5 rings");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q3.Who holds the world record for the highest number of ceturies in One Day Cricket?");
                   System.out.println("1.Steve Waugh         2.Sachin Tendulkar");
                   System.out.println("3.Sanath Jayasuriya   4.Sunil Gavaskar");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c3a=Integer.parseInt(br.readLine());
                   if(c3a==2)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 2.Sachin Tendulkar");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q4.What is a table tennis ball made up of");
                   System.out.println("1.Rubber    2.Cork");
                   System.out.println("3.Plastic   4.Celluloid");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c4=Integer.parseInt(br.readLine());
                   if(c4==4)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 4.Celluloid");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q5.The term 'Googly' is associated with");
                   System.out.println("1.Polo     2.Cricket");
                   System.out.println("3.Hockey   4.Football");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c5=Integer.parseInt(br.readLine());
                   if(c5==2)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 2.Cricket");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q6.Which is the national sport of India?");
                   System.out.println("1.Cricket     2.Hockey");
                   System.out.println("3.Badminton   4.Chess");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c6=Integer.parseInt(br.readLine());
                   if(c6==2)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 2.Hockey");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q7.Which one of the following is not a term of the indoor game-Chess?");
                   System.out.println("1.Checkmate   2.Knight");
                   System.out.println("3.Castling    4.Deuce");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c7=Integer.parseInt(br.readLine());
                   if(c7==4)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 4.Deuce");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q8.Which cricketer is also known as 'Tiger'?");
                   System.out.println("1.Sunil Gavaskar   2.Kapil Dev");
                   System.out.println("3.M.A.K. Pataudi   4.Sachin Tendulkar");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c8=Integer.parseInt(br.readLine());
                   if(c8==3)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.M.A.K. Pataudi");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q9.How many players play 'Kabaddi'?");
                   System.out.println("1.12   2.13");
                   System.out.println("3.11   4.15");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c9=Integer.parseInt(br.readLine());
                   if(c9==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.12");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q10.Rugby is the national game of which country?");
                   System.out.println("1.Scotland    2.Switzerland");
                   System.out.println("3.Mauritius   4.India");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c10=Integer.parseInt(br.readLine());
                   if(c10==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Scotland");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q11.Who wrote 'Gulliver's Travels'");
                   System.out.println("1.Rudyard Kipling   2.Alexandre Dumas");
                   System.out.println("3.Jonathan Swift    4.R.L. Stevenson");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c11=Integer.parseInt(br.readLine());
                   if(c11==3)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.Jonathan Swift");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q12.Who has authored the 'Jungle Book'");
                   System.out.println("1.Rudyard Kipling   2.R.L. Stevenson");
                   System.out.println("3.Charles Dickens   4.Lewis Carroll");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c12=Integer.parseInt(br.readLine());
                   if(c12==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.Rudyard Kipling");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q13.What is the name of Tintin's dog?");
                   System.out.println("1.Snoopy   2.Snowy");
                   System.out.println("3.Dollar   4.Scooby-doo");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c13=Integer.parseInt(br.readLine());
                   if(c13==2)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 2.Snowy");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q14.The famous villian 'Voldermort' appears in which of these books?");
                   System.out.println("1.The Hound of Baskervilles   2.Harry Potter and the Philosopher's Stone");
                   System.out.println("3.The Great Monster of Yeti   4.Hunchback of Notre Dame");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c14=Integer.parseInt(br.readLine());
                   if(c14==2)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 2.Harry Potter and the Philosopher's Stone");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q15.Who is the author of 'Discovery of India'?");
                   System.out.println("1.Motilal Nehru   2.Lal Bahadur Shastri");
                   System.out.println("3.Indira Gandhi   4.Jawaharlal Nehru");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c15=Integer.parseInt(br.readLine());
                   if(c15==4)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 4.Jawaharlal Nehru");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q16.Who is the author of the Harry Potter series?");
                   System.out.println("1.J.K. Rowling   2.Ruskin Bond");
                   System.out.println("3.Enid Blyton    4.Lewis Carroll");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c16=Integer.parseInt(br.readLine());
                   if(c16==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.J.K. Rowling");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q17.Which is the longest epic in the world literature?");
                   System.out.println("1.The Mahabharata    2.The Ramayana");
                   System.out.println("3.The Panchatantra   4.The Bible");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c17=Integer.parseInt(br.readLine());
                   if(c17==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.The Mahabharata");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q18.Which is the oldest literature in the world?");
                   System.out.println("1.The Vedas   2.Tha Ramayana");
                   System.out.println("3.The Bible   4.The Quran");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c18=Integer.parseInt(br.readLine());
                   if(c18==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.The Vedas");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q19.Who is the narrator of Arthur Conan Doyle's Sherlock Holmes stories?");
                   System.out.println("1.Sherlock     2.Dr. Charles");
                   System.out.println("3.Dr. Watson   4.Dr. Holmes");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c19=Integer.parseInt(br.readLine());
                   if(c19==3)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 3.Dr. Watson");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q20.Name the famoous British playwright who wrote 'Hamlet'.");
                   System.out.println("1.William Shakespeare   2.P.B. Shelley.");
                   System.out.println("3.Lord Tennyson         4.W.B. Yeats");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c20=Integer.parseInt(br.readLine());
                   if(c20==1)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 1.William Shakespeare");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q21.Name the american film cartoonist who created Mickey Mouse and Donald Duck.");
                   System.out.println("1.Warner Brothers    2.Walt Disney");
                   System.out.println("3.Steven Spielberg   4.Hanna Barbara");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c21=Integer.parseInt(br.readLine());
                   if(c21==2)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 2.Walt Disney");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q22.Who was the first Indian to win an Oscar award?");
                   System.out.println("1.Satyajit Ray          2.Raj Kapoor");
                   System.out.println("3.Dada Saheb Phalke     4.Bhanu Athaiya");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c22=Integer.parseInt(br.readLine());
                   if(c22==4)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 4.Bhanu Athaiya");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q23.Name the famous Indian actor who acted in the film 'Lagaan'.");
                   System.out.println("1.Shahrukh Khan   2.Fardeen Khan");
                   System.out.println("3.Salman Khan     4.Aamir Khan");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c23=Integer.parseInt(br.readLine());
                   if(c23==4)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 4.Aamir Khan");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q24.Who was the first Indian woman to go in to space?");
                   System.out.println("1.Sunita Williams   2.Kalpana Chawla");
                   System.out.println("3.Bachendri Pal     4.Kunjururani Devi");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c24=Integer.parseInt(br.readLine());
                   if(c24==2)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 2.Kalpana Chawla");
                   }
                   System.out.println("Get ready for the next question.");
                   System.out.println("Q25.Who is the Melody Queen of India?");
                   System.out.println("1.Asha Bhonsle     2.Anuradha Paudwal");
                   System.out.println("3.Shreya Ghoshal   4.Lata Mangeshkar");
                   System.out.println("Press the correct option number(1, 2, 3 or 4)");
                   int c25=Integer.parseInt(br.readLine());
                   if(c25==4)
                   {
                   System.out.println("Your answer is absolutely correct!!");
                   c3s++;
                   }
                   else
                   {
                   System.out.println("It is the wrong answer!!");
                   System.out.println("The correct answer was 4.Lata Mangeshkar");
                   }
                   System.out.println("Name:"+name);
                   System.out.println("Age:"+age);
                   System.out.println("Address:"+add);
                   System.out.println("Telephone/Mobile Number:"+tel);
                   System.out.println("Total Score="+c3s+"/25");
                   int n3=c3s;
                   System.out.println("Percentage="+(c3s*4)+"%");
                   int p3;
                   if(n3==0)
                   {
                   System.out.println("Better Luck Next Time.");  
                   }
                   else
                   {
                   if(1<=n3&&n3<=2)
                   {
                   p3=5000;
                   }
                   else if(2<n3&&n3<5)
                   {
                   p3=10000;
                   }
                   else if(4<n3&&n3<7)
                   {
                   p3=20000;
                   }
                   else if(6<n3&&n3<9)
                   {
                   p3=40000;
                   }
                   else if(8<n3&&n3<11)
                   {
                   p3=80000;
                   }
                   else if(10<n3&&n3<13)
                   {
                   p3=160000;
                   }
                   else if(12<n3&&n3<15)
                   {
                   p3=320000;
                   }
                   else if(14<n3&&n3<17)
                   {
                   p3=640000;
                   }
                   else if(16<n3&&n3<19)
                   {
                   p3=1250000;
                   }
                   else if(18<n3&&n3<22)
                   {
                   p3=2500000;
                   }
                   else if(21<n3&&n3<25)
                   {
                   p3=5000000;
                   }
                   else 
                   {
                   p3=10000000;
                   }
                   System.out.println("Congratulations!! You have won Rs."+p3);
                   }
                   }
                   catch(NumberFormatException ex)
                   {
                   System.out.println("Enter number as your option."); 
                   }
                   break;
            default:System.out.println("Please enter your choice number(1, 2, 3 or 4) correctly.");
        }
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Enter number as your option."); 
        }
    }
}