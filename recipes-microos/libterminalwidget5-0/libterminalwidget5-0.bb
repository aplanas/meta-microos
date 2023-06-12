SUMMARY = "Deepin-terminal libraries"
DESCRIPTION = "This package contains the libraries for deepin-terminal"
LICENSE = "GPL-3.0-only"

PV = "5.4.33"

RPM_NAME = "libterminalwidget5-0-5.4.33-1.7.aarch64.rpm"
RPM_HASH = "86dc1b8af8cc2c818e0a78ea0887f2a0d2f21fcc2c8add9ae3b7c4be2cdaa2292840e3a3273d0d93789f8967ed7e09ef3d161963216ab592490fc04db8c5299f"

RPROVIDES:${PN} += "libterminalwidget5-0 \
libterminalwidget5-0(aarch-64) \
libterminalwidget5.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
