SUMMARY = "Deepin-pw-check libraries"
DESCRIPTION = "This package contains the libraries for IBus"
LICENSE = "GPL-3.0+"

PV = "5.1.16"

RPM_NAME = "libdeepin_pw_check1-5.1.16-1.4.aarch64.rpm"
RPM_HASH = "895e09e1589153481c289f0708227e5fa729d660185e0685d5094e48be032c2602fb654246c9b4ecd16914612e4e9997da17ab2615ae1831e3d2ec8515c801b8"

RPROVIDES:${PN} += "libdeepin_pw_check.so.1()(64bit) libdeepin_pw_check1 libdeepin_pw_check1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrack.so.2()(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libiniparser.so.1()(64bit)"

inherit rpm
