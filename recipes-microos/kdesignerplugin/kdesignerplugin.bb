SUMMARY = "Framework for integration of KDE frameworks widgets with Qt Designer"
DESCRIPTION = "This framework provides plugins for Qt Designer that allow it to display \
the widgets provided by various KDE frameworks, as well as a utility \
(kgendesignerplugin) that can be used to generate other such plugins \
from ini-style description files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kdesignerplugin-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "5fdb3e44c799ea0ca8fdb39f24c09362b39389f88819ccf59a2fe2dccf629be1e1a12d27aa3074a45f175220f1b54c58d297d960edce8964f8cdbb73c5a125ed"

RPROVIDES:${PN} += "kdesignerplugin kdesignerplugin(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
