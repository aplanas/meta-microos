SUMMARY = "QML imports for the XmlPatterns module"
DESCRIPTION = "This package provides the QtQuick.XmlListModel QML import."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtxmlpatterns-imports-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "04559ba7c4a8eba66f678cec07cf26427a3b90eaf9404fcfcc3a3a306d91950af81e4d7bae72543dc0f2167cc29cf973c54978781b28ba15cb3597128a47cd1f"

RPROVIDES:${PN} += "libqmlxmllistmodelplugin.so()(64bit) libqt5-qtxmlpatterns-imports libqt5-qtxmlpatterns-imports(aarch-64) qt5qmlimport(QtQuick.XmlListModel.2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Qml.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5XmlPatterns.so.5()(64bit) libQt5XmlPatterns.so.5(Qt_5)(64bit) libQt5XmlPatterns5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
