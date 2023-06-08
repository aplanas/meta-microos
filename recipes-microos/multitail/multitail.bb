SUMMARY = "Tail Multiple Files"
DESCRIPTION = "MultiTail lets you view one or multiple files like the original \
tail program. \
 \
The difference is that it creates multiple windows on your console \
(with ncurses). Merging of 2 or even more logfiles is possible. \
 \
It can also use colors while displaying the logfiles (through \
regular expressions), for faster recognition of what is important \
and what not. It can also filter lines (again with regular \
expressions). It has interactive menus for editing given regular \
expressions and deleting and adding windows. One can also have \
windows with the output of shell scripts and other software. When \
viewing the output of external software, MultiTail can mimic the \
functionality of tools like 'watch' and such."
LICENSE = "GPL-2.0+"

PV = "6.5.0"

RPM_NAME = "multitail-6.5.0-1.11.aarch64.rpm"
RPM_HASH = "6ceaf0fc5ed5f0dc6966a35ca598af3555d1bc7b867b04c2221841c54876f36eacccea908edcf369b6ff4560a760c8b332b1ba5c2931d7c205e411443049cd65"

RPROVIDES:${PN} += "config(multitail) multitail multitail(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libpanelw.so.6()(64bit) libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
