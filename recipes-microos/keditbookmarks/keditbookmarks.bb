SUMMARY = "KDE Bookmark Editor"
DESCRIPTION = "This is an editor to edit your KDE-wide bookmark set."
LICENSE = "GPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "keditbookmarks-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "5ec7fe71e56766565811d08268cde549b40be29ce2d066ffe58a6795ddc903e7ca8fff9869f58461ecc8d8eaac558d5d20816d3e219d481c85768d99a069e6a9"

RPROVIDES:${PN} += "application() application(org.kde.keditbookmarks.desktop) keditbookmarks keditbookmarks(aarch-64) libkbookmarkmodel_private.so.6()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Bookmarks.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
