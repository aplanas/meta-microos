SUMMARY = "Disk Usage Viewer"
DESCRIPTION = "KDE free disk space utility"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdf-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "ca0619f51575325554eea4a9355a6ffa1eb9751f847ffd9fc844918548e56046858c16a9097f6d615cbd844ca80d5e34639d3001ac96de651f52205abc142cd8"

RPROVIDES:${PN} += "application() application(org.kde.kdf.desktop) kdf kdf(aarch-64) libkcm_kdf.so()(64bit) libkdfprivate.so.23()(64bit) metainfo() metainfo(org.kde.kdf.appdata.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
