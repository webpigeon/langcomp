VARIABLE test
: program
5 test !

-- if test == 3: return 4
test @ 3 = if 4 then
-- should have no effect

-- if test == 5: return 3 else return 2
test @ 5 = if 3 then 2 else
. 
-- should be 3

-- alternate syntax
test @ 3 = if 4 endif
test @ 5 = if 3 else 2 endif

;
program
