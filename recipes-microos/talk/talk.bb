SUMMARY = "Talk Client for Chatting with Another User"
DESCRIPTION = "This package contains the talk client, which allows you to chat with \
another user on a different system. Talk is a communication program \
which copies lines from one terminal to that of another user."
LICENSE = "BSD-3-Clause"

PV = "0.17"

RPM_NAME = "talk-0.17-721.13.aarch64.rpm"
RPM_HASH = "6c60969f54c712b98f895bc4e433c5cb34f462807411c36af94a79f7664bc722852c56887022840f32ab3fe519c212e013b9df840f226151e658a02399be9542"

RPROVIDES:${PN} += "nkitb:/usr/bin/talk talk talk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
