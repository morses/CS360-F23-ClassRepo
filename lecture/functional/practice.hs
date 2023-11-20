import System.Win32 (COORD(yPos))



tail' :: [a] -> [a]
tail' [] = error "no tail for an empty list"
tail' [x] = []
tail' [x,y] = [y]
tail' (x:xs) = xs

length' :: [a] -> Int
length' []     = 0
length' (x:xs) = 1 + length' xs

maxList [] = error "No maximum in an empty list"
maxList [x] = x
maxList [x,y] = if x > y then x else y
--maxList [x,y] = max x y
maxList (x:xs) = max x (maxList xs)

--stringLengths ["hello","this","is","a","list"] -> [5,4,2,1,4]
stringLengths :: [String] -> [Int]
stringLengths [] = []
stringLengths [x] = [length x]
stringLengths (x:xs) = length x : (stringLengths xs)

stringLengths' x = map length x

shuttle :: [a] -> [a] -> [a]
shuttle []     ys = ys
shuttle (x:xs) ys = shuttle xs (ys ++ [x])

