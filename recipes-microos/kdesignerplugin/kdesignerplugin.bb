SUMMARY = "Framework for integration of KDE frameworks widgets with Qt Designer"
DESCRIPTION = "This framework provides plugins for Qt Designer that allow it to display \
the widgets provided by various KDE frameworks, as well as a utility \
(kgendesignerplugin) that can be used to generate other such plugins \
from ini-style description files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kdesignerplugin-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "f2e22c735aea442921e4fe1cf6c873f38cee60c8ff674b0b804afd6c3f2d5e7bad290621dd396a613ff9d8d2b323de09039fe4c457972892b570fc3da341fa4c"

RPROVIDES:${PN} += "kdesignerplugin kdesignerplugin(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
