SUMMARY = "Floppy Formatter"
DESCRIPTION = "KDE Floppy Disk Utility"
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kfloppy-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b310885ece58577df3ba887b6ab8a6110bc8d9f5429c78dc817cdaea99a917c1f89c7043dc35af0d12bacdbcc969d53609eff424ef2dd432badb758661359917"

RPROVIDES:${PN} += "application() application(org.kde.kfloppy.desktop) kfloppy kfloppy(aarch-64) metainfo() metainfo(org.kde.kfloppy.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
