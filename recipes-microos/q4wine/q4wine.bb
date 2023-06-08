SUMMARY = "Qt GUI for WINE"
DESCRIPTION = "Q4Wine is a Qt-based GUI for WINE. It can help manage Wine \
prefixes and installed applications. \
 \
General features: \
- Can export Qt color theme into Wine color settings. \
- Can work with different Wine versions at the same time. \
- Creation, deletion and management of prefixes (WINEPREFIX). \
- Control for Wine process. \
- Autostart icon support. \
- CD image use. \
- Icons can be extracted from PE files (.exe, .dll). \
- Backup and restore for managed prefixes. \
- Wine AppDB browser. \
- Logging subsystem. \
- Winetricks support."
LICENSE = "GPL-3.0-only"

PV = "1.3.13"

RPM_NAME = "q4wine-1.3.13-1.16.aarch64.rpm"
RPM_HASH = "59ae1be5e5309687909cf16a8ad40cd7fc5ca88259f6a88af801c5fec8ca0f26d91ad760f996f73886f1c38fa52727d34c7adbd3ff1ee24348ade131812ff9cb"

RPROVIDES:${PN} += "application() application(q4wine.desktop) libq4wine-core.so()(64bit) mimehandler(application/x-ms-dos-executable) mimehandler(application/x-msi) q4wine q4wine(aarch-64)"
RDEPENDS:${PN} += "fuseiso icoutils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) sudo wine"

inherit rpm
