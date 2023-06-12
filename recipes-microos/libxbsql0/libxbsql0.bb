SUMMARY = "Shared libraries for xbsql"
DESCRIPTION = "XBase DBMS is a C++ library that supports access to XBase type data \
files and indexes (.dbf and related files, for example). It provides \
record level access to these files. \
 \
This package contains shared libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "0.11"

RPM_NAME = "libxbsql0-0.11-260.8.aarch64.rpm"
RPM_HASH = "1b4292e242e07fd4b88fb887c60e5191f69e8ae8c7cfd2eba290b7e58afc473237d0d5bc24d66509a8b8f07c57e225b72010017e2d6effebf252605c6f658b75"

RPROVIDES:${PN} += "libxbsql.so.0()(64bit) \
libxbsql0 \
libxbsql0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libxbase64.so.1()(64bit)"

inherit rpm
