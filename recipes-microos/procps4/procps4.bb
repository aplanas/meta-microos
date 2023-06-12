SUMMARY = "The ps utilities for /proc"
DESCRIPTION = "The procps package contains a set of system utilities that provide \
system information. Procps includes ps, free, skill, snice, tload, top, \
uptime, vmstat, w, and watch. The ps command displays a snapshot of \
running processes. The top command provides a repetitive update of the \
statuses of running processes. The free command displays the amounts of \
free and used memory on your system. The skill command sends a \
terminate command (or another specified signal) to a specified set of \
processes. The snice command is used to change the scheduling priority \
of specified processes. The tload command prints a graph of the current \
system load average to a specified tty. The uptime command displays the \
current time, how long the system has been running, how many users are \
logged on, and system load averages for the past one, five, and fifteen \
minutes. The w command displays a list of the users who are currently \
logged on and what they are running. The watch program watches a \
running program. The vmstat command displays virtual memory statistics \
about processes, memory, paging, block I/O, traps, and CPU activity."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.0.3"

RPM_NAME = "procps4-4.0.3-1.3.aarch64.rpm"
RPM_HASH = "106fecee2f0e4523f55953ccb526f9f871c0c7204ffe3888cc5b955a102de96d508d4c84c482abf1450d9f9fb8754937f8f79ea1efdab1a740b62113bb136dd4"

RPROVIDES:${PN} += "/bin/ps \
procps \
procps4 \
procps4(aarch-64) \
ps"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libproc2.so.0()(64bit) \
libproc2.so.0(LIBPROC_2)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
