SUMMARY = "Application to Design Electric Diagrams"
DESCRIPTION = "QElectroTech is a Qt5 application to design electric diagrams. It uses XML \
files for elements and diagrams, and includes both a diagram editor and an \
element editor."
LICENSE = "GPL-2.0-or-later & CC-BY-3.0"

PV = "0.80"

RPM_NAME = "qelectrotech-0.80-1.14.aarch64.rpm"
RPM_HASH = "d51b67a17b58a50de8304f23b055eb148eef795d36148b3334e6e7733153003b0bca7ca7af86ade08a03c29efd6e555fff1c972f2b4a7cc7e89113c35bb3e718"

RPROVIDES:${PN} += "application() application(qelectrotech.desktop) metainfo() metainfo(qelectrotech.appdata.xml) mimehandler(application/x-qet-element) mimehandler(application/x-qet-project) mimehandler(application/x-qet-titleblock) qelectrotech qelectrotech(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Concurrent.so.5()(64bit) libQt5Concurrent.so.5(Qt_5)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
