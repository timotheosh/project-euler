<?php

function checkNum($num) {
    $rtn = false;
    if (($num % 3 == 0) or ($num % 5 == 0))
        $rtn = true;
    return $rtn;
}

$sum = 0;
foreach (range(0, 999) as $i) {
    if (checkNum($i))
        $sum = $sum + $i;
}
echo $sum . "\n";

?>