SUMMARY = "Qt5 base examples"
DESCRIPTION = "Examples for the libqt5-qtbase modules."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libqt5-qtbase-examples-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "a91df38adffae579a93ffc3485cd916eae9d7656a2c96b246e83aacea8a9e2f6030ff31f6c4959e0de8028762d2f72c8fd3d8312fe432bae134f27bb82ca9927"

RPROVIDES:${PN} += "libechoplugin.so()(64bit) libpnp_extrafilters.so()(64bit) libqt5-qtbase-examples libqt5-qtbase-examples(aarch-64) libsimplestyleplugin.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Concurrent.so.5()(64bit) libQt5Concurrent.so.5(Qt_5)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5OpenGL.so.5()(64bit) libQt5OpenGL.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Test.so.5()(64bit) libQt5Test.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
