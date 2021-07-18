object Q3 extends App{def sum(num: Int): Int=
{
  if (num == 1)
    1
  else
    sum(num - 1) + num
}

}
