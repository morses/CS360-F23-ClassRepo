// Example from OpenSCAD, modified for this homework
module boxHat(width, offset)
{
difference()
{
cube(width/2, center = true);
# translate([0,0,-offset]) sphere(width / 3);
}
}
translate([0,0,20]) cylinder(h = 3*5-4, r1 = 15, r2 = 0, center = true);
boxHat(60,5);