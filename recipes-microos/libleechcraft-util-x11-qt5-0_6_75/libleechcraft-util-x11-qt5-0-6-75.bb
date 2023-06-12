SUMMARY = "X11 utility library for LeechCraft"
DESCRIPTION = "A library providing X11 wrappers for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-x11-qt5-0_6_75-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "abb7484e3cfc11e4ae20c04c89388cc9dcf47656c8b5a755a07c34cb0f50b542b935fe3c2a5ceea9078a9a3a060d9aa0a586c47043f4df0f2f2df19073c5ad75"

RPROVIDES:${PN} += "libleechcraft-util-x11-qt5-0_6_75 \
libleechcraft-util-x11-qt5-0_6_75(aarch-64) \
libleechcraft-util-x11-qt5.so.0.6.75()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
