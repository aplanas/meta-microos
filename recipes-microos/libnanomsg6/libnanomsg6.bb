SUMMARY = "Shared library for nanomsg"
DESCRIPTION = "nanomsg is a C socket library providing several common communication \
patterns."
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "libnanomsg6-1.2-1.3.aarch64.rpm"
RPM_HASH = "dbce78b87f98814a59d5d0ac8c63aa2816b1430e4bb6bba67de5bdadc3a495ee692506a38022ec17c17272c3a37e33e0a8208047bab0d77abdfbec27c85b2a13"

RPROVIDES:${PN} += "libnanomsg.so.6()(64bit) libnanomsg6 libnanomsg6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
