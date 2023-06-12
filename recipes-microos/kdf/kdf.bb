SUMMARY = "Disk Usage Viewer"
DESCRIPTION = "KDE free disk space utility"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdf-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4dc5b245a0c9163a92a26a5067ac8893100fdf6f64f34bd1598e7ad12f6112c6fcfd35004ff030fb4414a59fdf070be7388e4116bf7e63231116c89ba983fd4f"

RPROVIDES:${PN} += "application() application(org.kde.kdf.desktop) kdf kdf(aarch-64) libkcm_kdf.so()(64bit) libkdfprivate.so.23()(64bit) metainfo() metainfo(org.kde.kdf.appdata.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
