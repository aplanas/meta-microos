SUMMARY = "KDE's window decorations library"
DESCRIPTION = "Plugin based library to create window decorations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "libkdecorations2-5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "e3791ac61e858a7806f3c3fabe1c7bec0867c3ff36a4e18d57f25f6712130d301a6a99191ba5cd5a8eb80259b976c1a3efd58214a91ae7243e73db5221051cce"

RPROVIDES:${PN} += "libkdecorations2-5 \
libkdecorations2-5(aarch-64) \
libkdecorations2.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5I18n.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libkdecorations2private.so.10()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
