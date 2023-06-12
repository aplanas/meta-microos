SUMMARY = "Library for computation of Gröbner bases with 4ti2"
DESCRIPTION = "This package contains the 4ti2 program library, which comes in three \
flavors: \
- 32-bit precision integers \
- 64-bit precision integers \
- arbitrary precision integer support through use of GNU MP"
LICENSE = "GPL-2.0-or-later"

PV = "1.6.10"

RPM_NAME = "lib4ti2-0-1.6.10-1.1.aarch64.rpm"
RPM_HASH = "5ad96b4d7cf5a43bfa6e777a045358d37d7e39a5ab5aa8b228d487dbc0b46c4c79a2436c2862b01615721105c1fd8fe82b43917f3f589ce29dcbd1e6a7f86d29"

RPROVIDES:${PN} += "lib4ti2-0 \
lib4ti2-0(aarch-64) \
lib4ti2common.so.0()(64bit) \
lib4ti2gmp.so.0()(64bit) \
lib4ti2int32.so.0()(64bit) \
lib4ti2int64.so.0()(64bit) \
lib4ti2util.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libglpk.so.40()(64bit) \
libgmp.so.10()(64bit) \
libgmpxx.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
