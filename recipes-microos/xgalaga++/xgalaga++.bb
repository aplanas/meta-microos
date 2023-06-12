SUMMARY = "Classic single screen vertical shoot em up"
DESCRIPTION = "XGalaga++ is a classic vertical scrolling shoot em up. \
It requires no X Window extension and its window is freely resizable. \
It is inspired by XGalaga, but rewritten from scratch, \
except for the graphics."
LICENSE = "GPL-2.0-only"

PV = "0.9"

RPM_NAME = "xgalaga++-0.9-1.14.aarch64.rpm"
RPM_HASH = "a8302d020ce6361cf5032c4ca119ca3313feb14297800139b849cc51cb078e4080a1524b6c453dd7fcd5ab216b680169f438025902cde06f5f2d520c42c5d220"

RPROVIDES:${PN} += "application() \
application(xgalaga++.desktop) \
xgalaga++ \
xgalaga++(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXpm.so.4()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
