SUMMARY = "Compact C Type Format library (runtime, no BFD dependency)"
DESCRIPTION = "This package includes the libctf-nobfd shared library. \
The Compact C Type Format (CTF) is a way of representing information about a binary program"
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "libctf-nobfd0-2.40-4.1.aarch64.rpm"
RPM_HASH = "5c6a560f5b185c475392c39e8e9abac1d7568b3fab62c2621afcde23f073e1b3402c62849ea89f525c5ae71c87f2bcb8aa3b72c5379f3ea8f6e308b410b47b2f"

RPROVIDES:${PN} += "libctf-nobfd.so.0()(64bit) libctf-nobfd.so.0(LIBCTF_1.0)(64bit) libctf-nobfd.so.0(LIBCTF_1.1)(64bit) libctf-nobfd.so.0(LIBCTF_1.2)(64bit) libctf-nobfd0 libctf-nobfd0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
