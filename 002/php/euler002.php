<?php
$curr = 1;
$prev = 1;
$sum = 0;
while ($curr < 4000001) {
	$c = $curr;
	if ($curr % 2 == 0)
		$sum += $curr;
	$curr = $prev + $c;
	$prev = $c;
}
echo $sum . "\n";

?>
