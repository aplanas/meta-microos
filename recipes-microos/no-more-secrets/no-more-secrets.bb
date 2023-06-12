SUMMARY = "A recreation of the 'decrypting text' effect from the 1992 movie Sneakers"
DESCRIPTION = "A tool to recreate the famous 'decrypting text' effect as seen in the 1992 movie Sneakers."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "no-more-secrets-1.0.1-1.7.aarch64.rpm"
RPM_HASH = "1b312dbac56dee9b24fa211c12cb3acc485cee4ed4afd65f3b79802ef4068b7a5e6d4d0af1c1be8fffb8a34e94485565135c8828b4db42278c4cd6479d4a2fbc"

RPROVIDES:${PN} += "no-more-secrets \
no-more-secrets(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
