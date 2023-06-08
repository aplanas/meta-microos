SUMMARY = "KDE Character Selector"
DESCRIPTION = "KCharSelect is the KDE character selector tool."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kcharselect-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "3e28395d58f8af9642ed18952aa170e842bb9777df0e4348297a50cd700895dcb2c3783bb164091855bc5ea01d5aab34487a656c78fdf51ca063e53c2792f9ee"

RPROVIDES:${PN} += "application() application(org.kde.kcharselect.desktop) kcharselect kcharselect(aarch-64) kcharselect5 metainfo() metainfo(org.kde.kcharselect.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Bookmarks.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
