SUMMARY = "Binary Search a sorted array with XS routines."
DESCRIPTION = "A binary search searches _sorted_ lists using a divide and conquer \
technique. On each iteration the search domain is cut in half, until the \
result is found. The computational complexity of a binary search is O(log \
n). \
 \
This module implements several Binary Search algorithms using XS code for \
optimal performance. You are free to use this module directly, or as a \
plugin for the more general List::BinarySearch. \
 \
The binary search algorithm implemented in this module is known as a \
_Deferred Detection_ Binary Search. Deferred Detection provides *stable \
searches*. Stable binary search algorithms have the following \
characteristics, contrasted with their unstable binary search cousins: \
 \
* * In the case of non-unique keys, a stable binary search will always \
  return the lowest-indexed matching element.  An unstable binary search \
  would \
  return the first one found, which may not be the chronological first. \
 \
* * Best and worst case time complexity is always O(log n).  Unstable \
  searches may stop once the target is found, but in the worst case are \
  still \
  O(log n).  In practical terms, this difference is usually not meaningful. \
 \
* * Stable binary searches only require one relational comparison of a \
  given pair of data elements per iteration, where unstable binary searches \
  require two comparisons per iteration. \
 \
* * The net result is that although an unstable binary search might have \
  better 'best case' performance, the fact that a stable binary search gets \
  away \
  with fewer comparisons per iteration gives it better performance in the \
  worst \
  case, and approximately equal performance in the average case. By trading \
  away \
  slightly better 'best case' performance, the stable search gains the \
  guarantee \
  that the element found will always be the lowest-indexed element in a \
  range of \
  non-unique keys."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-List-BinarySearch-XS-0.09-1.17.aarch64.rpm"
RPM_HASH = "4db3e3e89a3ab6cad9a3c1394412d2b157bace66f736e6b2fadc3bc9c2b08caf95f8bc5186c9fed74c000581bd73103a0fdccda24c83a64049ea9b0405d35b5e"

RPROVIDES:${PN} += "perl(List::BinarySearch::XS) perl-List-BinarySearch-XS perl-List-BinarySearch-XS(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
