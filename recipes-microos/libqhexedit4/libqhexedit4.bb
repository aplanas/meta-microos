SUMMARY = "Qt5 qhexedit2 library"
DESCRIPTION = "Qt5 library for qhexedit2."
LICENSE = "LGPL-2.0-only"

PV = "0.8.9"

RPM_NAME = "libqhexedit4-0.8.9-1.15.aarch64.rpm"
RPM_HASH = "6c3a0a9ccc3c207c58d8374ae2a6723bca6b964db0b8990421e0aef7d188a7e52142446344b7e77f1d32c602d9d5fc268a9beeeb6f495d62578579023c6f10fe"

RPROVIDES:${PN} += "libqhexedit.so.4()(64bit) \
libqhexedit4 \
libqhexedit4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
