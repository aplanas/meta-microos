SUMMARY = "Compact C Type Format library (runtime, BFD dependency)"
DESCRIPTION = "This package includes the libctf shared library. \
The Compact C Type Format (CTF) is a way of representing information about a binary program"
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "libctf0-2.40-4.1.aarch64.rpm"
RPM_HASH = "5bd6b41192341ab8e03c32b57e01bf6a931374cddffe4b8862078f1f36f93fa3d38520b95b969424967cb1f62d48907802cfd56e61e0e84e7e6d5e1030d74569"

RPROVIDES:${PN} += "libctf.so.0()(64bit) libctf.so.0(LIBCTF_1.0)(64bit) libctf.so.0(LIBCTF_1.1)(64bit) libctf.so.0(LIBCTF_1.2)(64bit) libctf0 libctf0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfd-2.40.0.20230412-4.so()(64bit) libc.so.6(GLIBC_2.33)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
