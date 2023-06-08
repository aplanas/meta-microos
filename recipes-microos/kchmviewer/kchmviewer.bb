SUMMARY = "KDE CHM and ePub Viewer"
DESCRIPTION = "This is a viewer for ebooks and documentation in CHM (Microsoft Compiled HTML) and ePub formats. \
It supports complex searching for large books and has various viewing features."
LICENSE = "GPL-3.0-only"

PV = "8.0"

RPM_NAME = "kchmviewer-8.0-3.2.aarch64.rpm"
RPM_HASH = "796f59c0016cc359dd22f1491fb5ed5515cde02b191028012f3968c543a55786c952e11726289c99c14c7d1fdd4332ec882177406461fb51a4a3921e2d67c5f9"

RPROVIDES:${PN} += "application() application(net.kchmviewer.kchmviewer.desktop) kchmviewer kchmviewer(aarch-64) mimehandler(application/chm) mimehandler(application/epub+zip) mimehandler(application/vnd.ms-htmlhelp) mimehandler(application/x-chm)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5WebEngineCore.so.5()(64bit) libQt5WebEngineCore.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libchm.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libzip.so.5()(64bit)"

inherit rpm
