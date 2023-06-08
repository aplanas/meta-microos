SUMMARY = "UI Files Viewer"
DESCRIPTION = "Displays Qt Designer UI files"
LICENSE = "GPL-2.0-only & GFDL-1.2-only & LGPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "kuiviewer-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "ccb7de96d93d3976f87142572d5d79b77bbeacd5a53fde8c679f173b664b09333f350044c0a57997af4af63cbb53831f06f010296fdd4c0468ae912b942633e2"

RPROVIDES:${PN} += "application() application(org.kde.kuiviewer.desktop) kuiviewer kuiviewer(aarch-64) metainfo() metainfo(org.kde.kuiviewer.metainfo.xml) metainfo(org.kde.kuiviewerpart.metainfo.xml) mimehandler(application/x-designer)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Designer.so.5()(64bit) libQt5Designer.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
