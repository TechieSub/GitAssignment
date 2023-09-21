public class GitAssignment02 {
    public static void main(String[] args) {
        System.out.println("1.How to check if git is available on your system? " +"Ans : using command 'git --version'");
        System.out.println("2.How to initialize a new GiB repository? "+"Ans : by cmd 'git init'");
        System.out.println("3.How to tell git about your name and email? "+"Ans : By cmd 'git config --global user.name<  >   +" +
                "'git config --global user,email <  >");
        System.out.println("4.How to add a file to the staging area? "+"Ans : by using cmd 'git add < file name.java> ");
        System.out.println("5.How to remove a file from the staging area? "+"Ans : 'git rm --cached <file name.java>");
        System.out.println("6.How to make a commit? "+"Ans : 'git commit -m <msg in under quotation mark>");
        System.out.println("7.How to send your changes to a remote repository? "+"Ans : 'git push origin main' ");
        System.out.println("8.What is the difference between clone and pull? "+"Ans : 1. Clone : that actually brings the whole repo from remote server to your local machine" +
                "2.git pull brings the changes made to repo/code from another developer from remote server to local machine ");

    }
}
