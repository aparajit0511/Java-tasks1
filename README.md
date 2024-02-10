# Java-tasks1


GitHub released a native Windows client which makes all the below steps redundant.

You can also use Sourcetree to get both Git and Mercurial setup on Windows.

Here is how you would do it in Windows:

If you don't have Git installed, see this article on how to set it up.

Open up a Windows command prompt.

Change into the directory where your source code is located in the command prompt.

First, create a new repository in this directory git init. This will say "Initialized empty git repository in ....git" (... is the path).

Now you need to tell Git about your files by adding them to your repository. Do this with git add filename. If you want to add all your files, you can do git add .

Now that you have added your files and made your changes, you need to commit your changes so Git can track them. Type git commit -m "adding files". -m lets you add the commit message in line.

So far, the above steps is what you would do even if you were not using GitHub. They are the normal steps to start a Git repository. Remember that Git is distributed (decentralized), meaning you don't need to have a "central server" (or even a network connection), to use Git.

Now you want to push the changes to your Git repository hosted with GitHub. You do this by telling Git to add a remote location, and you do that with this command:

git remote add origin https://github.com/yourusername/your-repo-name.git

*Note: your-repo-name should be created in GitHub before you do a git remote add origin ...

Once you have done that, Git now knows about your remote repository. You can then tell it to push (which is "upload") your committed files:

git push -u origin master

original link - https://stackoverflow.com/questions/12799719/how-to-upload-a-project-to-github
