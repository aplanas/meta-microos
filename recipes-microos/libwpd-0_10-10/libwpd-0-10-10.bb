SUMMARY = "Library for importing WordPerfect Documents"
DESCRIPTION = "libwpd is a general purpose library for reading or interpreting data \
from WordPerfect files. The library is not a stand-alone utility: it is \
designed to be used by another program (for example, a word processor) \
as an in-process component."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.10.3"

RPM_NAME = "libwpd-0_10-10-0.10.3-3.8.aarch64.rpm"
RPM_HASH = "6037649c79e270bdf2859f1a8c6c80ea10c423ad8b32418f4d2e48a630cca41badd9116f8e610d0c99238c3cf4ee0cc5a741b2325b46f80fe85ae19339fa60d1"

RPROVIDES:${PN} += "libwpd-0.10.so.10()(64bit) libwpd-0_10-10 libwpd-0_10-10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) librevenge-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
