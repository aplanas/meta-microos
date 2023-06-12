SUMMARY = "Library of Efficient Models and Optimization in Networks"
DESCRIPTION = "LEMON stands for Library for Efficient Modeling and Optimization in \
Networks.  It is a C++ template library providing efficient \
implementations of common data structures and algorithms with focus on \
combinatorial optimization tasks connected mainly with graphs and \
networks. \
 \
This package contains the shared library of LEMON."
LICENSE = "BSL-1.0"

PV = "1.3.1"

RPM_NAME = "libemon1_3_1-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "85289abbdecf65676573041c81fa3e797364bcbc840865ba122537bd2b3ad76a37c5d5e43346f28c7e13d4040e40af796b36a9d10bf355d19a5974a2c30a5933"

RPROVIDES:${PN} += "libemon.so.1.3.1()(64bit) \
libemon1_3_1 \
libemon1_3_1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglpk.so.40()(64bit) \
libglpk40 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
