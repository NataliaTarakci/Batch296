package first_git_package;

public class MyGitClass {

    public static void main(String[] args) {

        System.out.println("Version 1");

            /*
            HOW WE CAN PUSH A GIT PROJECT TO GITHUB?- FOR THE FIRST TIME
            Notes:
            1- git init >> Create local repository. Create a .git folder. DO THIS ONCE FOR EACH PROJECT
                    NOTE: If git is not installed, then you will se an error.
            2- git status (OPTIONAL) >> Shows changes. Our guide. Use anytime to see current condition.
            3- git add .  >> add(stage) changes in Git repository for the next commit
            4- git commit -m "any message" >> create a new commit(new version). Moves codes from Staging Area to Local Repository.
            5- git branch -M main >> rename the current branch to main. DO THIS ONCE FOR EACH PROJECT
            6- git remote add origin <repository-url> >> used to connect your local git to a remote repository. DO THIS ONCE FOR EACH PROJECT
            7- git push -u origin main >> push the code to remote repository (github) DO THIS ONCE FOR EACH PROJECT
             */


        /*
            HOW TO CREATE BRANCH AND PUSH OUR CODES TO THAT BRANCH IN GITHUB - FOR THE FIRST TIME
            Notes:
            1- git branch <name>    >>> Create a new branch (ONCE)
            2- git branch -a       >>> Checks all branches  (OPTIONAL)
            3- git branch          >>> Check the branch ( green= current branch) (OPTIONAL)
            4- git checkout <name>   >>> Switch to the feature branch
                Now I am on the feature branch. All changes I make will be only on this branch
                add some codes,
            4- git add .
            5- git commit -m "message"
            6- git push --set-upstream origin <name>      (OR git push AND GIT WILL SHOW THE UPSTREAM COMMAND) (ONCE)
         */

        /*
            How to push new commits to GitHub

            - After first commit

            1- git add .
            2- git commit -m "message"
            3- git push origin <branch> (main or other)
         */
    }
}
