# CMPSC 100-03 Lab Session 6: Potion Commotion
* Assigned: 21 October 2019
* Due: 28 October 2019
* Point value: 45 pts

In this laboratory session, we explore topics including: 

* `while` loops
* Java `iterators`
* Interacting with and managing program "control-of-flow"
* Internal and external methods and objects

## General guidelines for laboratory sessions

* **Follow steps carefully.** Laboratory sessions often get a bit more complicated than their preceeding Practical sessions. Especially for early sessions which expose you to platforms with which you may not be familiar, take notes on `command`s you run and their corresponding effects/outputs. If you find yourself stuck on a step, let a TL or the professor know! Laboratory sessions do not mean that we won't help you in the same way we do during Practicals.
* **Regularly ask and answer questions.** Some of you may have more experience with the topics we're discussing than others. We can use this knowledge to our advantage. But, like in Practicals, let students try things for a while before offering help (**always _offer_ first**). To ask questions, use our [Slack](https://cmpsc100fall2019.slack.com)'s `#labs` channel.
* **Store and transfer files using GitHub.** Various forms of file storage are more or less volatile. *You* are responsible for backing up and storing files. If you're unsure of files which have been changed, you can always type `git status` in the terminal for your working folder to determine what you need to back up.
* **Keep all of your files.** See above, but also remember that you're responsible for the files you create.
* **Back up your files regularly.** See above (& above-above).
* **Review the [Honor Code](https://sites.allegheny.edu/about/honor-code/) reguarly when working.** If you're taking a solution from another student or the Internet at-large (_especially_ [Stack Overflow](https://stackoverflow.com)), bear in mind that using these solutions _can_ constitute a form of plagiarism that violates the Allegheny Honor Code. While it may seem easy and convenient to use these sources, it is equally easy and convenient to rely on them and create bad habits which include not attributing credit or relying exclusively on others to solve issues. Neither are productive uses of your intellect. Really.

## Further helpful reading for this assignment

If you have not already done so, I recommend reading the [GitHub Guides](https://guides.github.com) which GitHub makes available. In particular, the guides:
* [Mastering markdown](https://guides.github.com/features/mastering-markdown/)
* [Documenting your projects on GitHub](https://guides.github.com/features/wikis/)
* [GitHub Handbook](https://guides.github.com/introduction/git-handbook/)
* GitHub handouts distributed at the beginning of the lab session
* _JSS_ page 73: a section on the `%` (modulus) operator

As for a markdown cheatsheet, [this GitHub repository](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet) serves as a useful online, single-page guide.

## Potion Commotion

![Potion Commotion](https://www.cs.allegheny.edu/sites/dluman/cmpsc100/img/lab-06-potion.png)

G. Wiz loves his position as an adjunct at the wizard college. But, lately, his penchant for the best in wizard finery (i.e. hats) has started to overwhelm the pay he's been drawing from the job! As such, he's decided to diversify the offerings of his private wizard practice by specializing in a new line of tonics he recently read about in _Gator Wizards Quarterly_: one that promises to give thumbs to any gator who imbibes the mixture.

Of course this is exciting news, but G. Wiz knows that the only way he can truly keep up with his hat purchases is to create a tonic which is clearly the best. As such, he's been reviewing the literature to see what kind of progress researchers have made. He's collected **200** outcomes from the latest tests of what seems to be the most promising recipe. However, it's hard for him to analyze the sheer amount of data and he's come to you for some help.

He provided the list of tests in a file called `results.list` in the `inputs` directory in the form of a "true/false" list (instances where the tonic worked are marked as `true`, those in which the tonic failed are `false`). Your task: provide G. Wiz with some basic analytics on the data so that he can test if this preparation is the right one to pursue!

## Required deliverables

A successful submission for this lab includes two (2) Java files and one (1) `reflection.md` file.

- [ ] The repository should have at least 5 commits

### `TestTonic.java`

While not specifically named in the criteria below, you will need (at the very least):

* An identifier which holds each `boolean` read from the `Scanner` instance
* An identifier to track the number of items read by the `Scanner` instance
    * Here, I suggest `count`
* At least one identifier to track the number of successful tests

The grading criteria below are written to accomodate a wide variety of solutions.

- [ ] Contains no `TODO` placeholder markers
- [ ] Contains no `{YOUR NAME HERE}` placeholder markers
- [ ] Uses exactly 1 `while` loop
- [ ] Implements the `.hasNext()` method of `Scanner` (an `iterator`)
- [ ] Implements the `.nextBoolean()` method of `Scanner`
- [ ] Implements 1 object of the `boolean` primitve type
- [ ] Uses 2 instances of the `++` increment operator
- [ ] Uses 1 instance of the `%` (`modulus`) operator (see page 73 in _JSS_)
* Hint: implement this operator to display the results after every 10 tests
- [ ] Uses 1 `if` statement (either using bracket format or `?` (`ternary`) -- operator)
- [ ] Successfully implements a version of the `progress` method in the `while` loop
* The `progress` method should:
    * Have the correct `return` type
    * Print a one-line "progress report" in the form of: `## Test:  ## successes  ## failures` (see below)
- [ ] Uses at least one instance of a `Fraction` object
- [ ] Produces output exactly like the following example:

```
10 tests:       5 successes     5 failures
20 tests:       10 successes    10 failures
30 tests:       16 successes    14 failures
40 tests:       21 successes    19 failures
50 tests:       26 successes    24 failures
60 tests:       32 successes    28 failures
70 tests:       37 successes    33 failures
80 tests:       42 successes    38 failures
90 tests:       48 successes    42 failures
100 tests:      52 successes    48 failures
110 tests:      56 successes    54 failures
120 tests:      60 successes    60 failures
130 tests:      65 successes    65 failures
140 tests:      70 successes    70 failures
150 tests:      74 successes    76 failures
160 tests:      79 successes    81 failures
170 tests:      84 successes    86 failures
180 tests:      88 successes    92 failures
190 tests:      93 successes    97 failures
200 tests:      97 successes    103 failures

Worked in 97/200 cases (48.5%)
Failed in 103/200 cases (51.5%)
```

### `Fraction.java`

- [ ] Exists

### `reflection.md`

- [ ] Contains no `TODO` placeholder markers
- [ ] Contains at least 500 words
- [ ] Contains at least 8 headings
- [ ] Uses at least one code block
- [ ] Responds to _all_ questions

## GatorGrader

### Docker `container`

If you do not already have the GatorGrader `container`, in a new terminal or Docker Quickstart Terminal, type `docker pull gatoreducator/dockagator` to download the correct `container`.

In the last lab session, we were able to get Docker `container` versions of GatorGrader working! That means that everyone can choose to use the `container` if they'd like. Here are a couple of ways to do it.

#### Running GatorGrader directly on `container` start

* Be sure that you are in the main directory of your practicals repository when running these commands, or you'll certainly experience issues!
* Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
* To make sure you're in the right repository, run a `pwd` command.
    * If you recieve the expected path, you're in the right place. Else, find your way to the right location.

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container`

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator /bin/bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key.
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key.

### Using `gradle` commands directly

- [ ] In a terminal, ensure you're in the main folder of your practical repository and type `gradle build`
- [ ] After the `command` completes successfully, type `gradle grade`

## `commit` your work

When you've finished your work: remember that there are three (3) steps to submitting a `git` repository: to "pack," to "label," and to "ship."

* Note: attempt all of these from the main directory of the repository.

- [ ] To "pack" the submission: `git add .`
- [ ] To "label" the submission: `git commit -m "{ADD MESSAGE DESCRIPTING PURPOSE OF COMMIT HERE}"`
- [ ] To "ship" the submission: `git push`