SUMMARY = "Text File Browser and Pager Similar to more"
DESCRIPTION = "less is a text file browser and pager similar to more. It allows \
backward as well as forward movement within a file. Also, less does not \
have to read the entire input file before starting. It is possible to \
start an editor at any time from within less."
LICENSE = "BSD-2-Clause | GPL-3.0-or-later"

PV = "633"

RPM_NAME = "less-633-1.1.aarch64.rpm"
RPM_HASH = "587a688ebd03a27fee9ec3919661f21c9d03835e8b150abcf4152c52568745fd09ceb9563282d906d114f3d6a7e818b290406c5cf2b18d87b0fba64826c886a6"

RPROVIDES:${PN} += "less less(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/which file ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
