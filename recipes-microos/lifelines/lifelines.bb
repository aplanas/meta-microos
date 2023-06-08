SUMMARY = "The Lifelines Genealogy Program"
DESCRIPTION = "Lifelines is terminal-based program that allows the tracking of \
genealogical information.  The lifelines reports are the power of the \
system but requires knowledge in the ll format."
LICENSE = "MIT"

PV = "3.1.1+3ad4571"

RPM_NAME = "lifelines-3.1.1+3ad4571-3.13.aarch64.rpm"
RPM_HASH = "d00bfbe721a74bf57266d8882cfbacc7979ea938d627a3bde0f25fb534c4ef2b8e3d14824590580fa1934ffe996e462ffb940b1b3caa6ecdf2808a69b91fa0f7"

RPROVIDES:${PN} += "config(lifelines) lifelines lifelines(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
