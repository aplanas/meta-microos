SUMMARY = "KDE's window decorations library"
DESCRIPTION = "Plugin based library to create window decorations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "libkdecorations2-5-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "1880e388898558758977a444ea3f15db0a26003c78b0551550d7d241952f3cad70549ce42469033a9f10677fb6a3a840ab2c700e400e579b5361faf01c01b84b"

RPROVIDES:${PN} += "libkdecorations2-5 libkdecorations2-5(aarch-64) libkdecorations2.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libkdecorations2private.so.10()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
