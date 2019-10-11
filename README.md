# Project2
I forgot to make this for a while.  Sorry.
I made many different variables, many of which I did not use in the end.
In PosAvg, I had to adjust my toString method to meet Zylabs' expectations, since it would appear an error in calculation of the actual indexes occurred
I had to use a different way to obtain the avg in MesoInherit's calAverage method.  I thought Math.rint would work since it would return
the integer value closest to the double value, but did not take into account when the average would have 0.5 as part of the double.
I ended up using Math.round instead, since it does what Math.rint does, plus accounts for the 0.5 cases.
I could not get LetterAvg working, since I could not get the counter to increment and could not test my toString as a result.
All tests except 10, 11, 12 and 13 worked.
A lot of my code is commented with tests and extra parts I ended up not needing due to changing my path to completing this project, so
sorry about the messy code.
