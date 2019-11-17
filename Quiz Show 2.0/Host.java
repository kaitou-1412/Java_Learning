class Host
{
	Host()
	{
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
	}
        void rules()
        {
                System.out.println("********************************************************************************************************************************");
                System.out.println("Rules and Regulations:");
                System.out.println("Answer across 25 questions");
                System.out.println("Start with the 1st question and once you have decided your final answer(and you are absolutely sure of it...)");
                System.out.println("Press the correct option number(1, 2, 3 or 4)");
                System.out.println("After answering all 25 questions, you would be given your total score, percentage and gifts as per your percentage.");
                System.out.println("Are you ready?");
                System.out.println("You should be.");
                System.out.println("Best of luck!");
                System.out.println("********************************************************************************************************************************");
        }
        void prize_money(int n)
        {
                System.out.println("Total Score="+n+"/25");
                System.out.println("Percentage="+(n*4)+"%");
                long p = 0;
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
                System.out.println("Thank You for participating in this quiz!!!");
                System.out.println("********************************************************************************************************************************");
        }
}