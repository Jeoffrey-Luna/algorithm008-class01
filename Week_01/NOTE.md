学习笔记
数组，链表和跳表
三种数据结构都属于线性数据结构


数组的时间复杂度分析：
prepend    O(1)   注意：正常情况下数组的prepend操作的时间复杂度是O(n)
append     O(1)        但是可以进行特殊优化到O(1)。采用的方式是申请稍大
lookup     O(1)        的内存空间，然后在数组最开始预留一部分空间，然后
insert     O(n)        在数组最开始预留一部分空间，然后prepend的操作则是把
delete     O(n)        头下标前移一个位置



访问  O(1)

链表的时间复杂度
prepend     O(1)
append      O(1)
lookup      O(n)  随机访问的时候的时间复杂度
insert      O(1)
delete      O(1)

待讲解的习题：
242.Valid Anagram hash解法

66. Plus one