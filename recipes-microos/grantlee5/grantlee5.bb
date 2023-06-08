SUMMARY = "Qt string template library"
DESCRIPTION = "Grantlee is a string template engine based on the Django template system and \
written in Qt."
LICENSE = "LGPL-2.1-or-later"

PV = "5.3.1"

RPM_NAME = "grantlee5-5.3.1-1.3.aarch64.rpm"
RPM_HASH = "b49c29b38634e9d4d6b45927964efda2e9397a34fe261f5e682fd5d7af852b721687c25711b77cef2b32f71b65c58985dfc4d79e7b0cf7697f300139b8025f3b"

RPROVIDES:${PN} += "grantlee5 grantlee5(aarch-64) libGrantlee_Templates.so.5()(64bit) libGrantlee_TextDocument.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
