SUMMARY = "KDE's window decorations library"
DESCRIPTION = "Plugin based library to create window decorations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "libkdecorations2private10-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "3a2992f7ea3e62a675729c020ee8a24f0ca9b64676770df9707a8518e6916a34facff69869283fd42e10ed818eb12e1bb168dfbdc3f44d833d1104f98f073506"

RPROVIDES:${PN} += "libkdecorations2private.so.10()(64bit) libkdecorations2private10 libkdecorations2private10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
