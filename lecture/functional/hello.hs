
main = putStrLn "Hello, World!"


add :: Num a => a -> a -> a
add a b = a + b

doubleUs :: Double -> Double -> Double
doubleUs x y = x*2 + y*2

doubleSmallNumber x = if x > 100 then x else x*2 

myList = [1,5,8,3,9,2,4,6,7]

-- Not this
--(++) :: a -> [a] -> [a]

factorial n = product [1..n]

primes = filterPrime [2..] where
  filterPrime (p:xs) =
    p : filterPrime [x | x <- xs, x `mod` p /= 0]