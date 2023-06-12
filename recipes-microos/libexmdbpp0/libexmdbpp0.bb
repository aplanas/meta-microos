SUMMARY = "A C++ implementation of the exmdb wire protocol"
DESCRIPTION = "The library provides a C++ API and implementation for constructing \
exmdb protocol requests and responses and conversing with a server."
LICENSE = "AGPL-3.0-or-later"

PV = "1.10.4.b7a36f2"

RPM_NAME = "libexmdbpp0-1.10.4.b7a36f2-1.1.aarch64.rpm"
RPM_HASH = "33d72759bd70107b95d985e7d181c6c7c1b7a2e4638df888aa23f90cb11069b07ab58ad07087487c4436305a65247419890b053b0feddde191b1aa3955789308"

RPROVIDES:${PN} += "libexmdbpp.so.0()(64bit) \
libexmdbpp0 \
libexmdbpp0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
