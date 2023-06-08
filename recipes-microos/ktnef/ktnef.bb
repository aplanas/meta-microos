SUMMARY = "Viewer for email attachments in TNEF format"
DESCRIPTION = "KTNEF is a viewer for email attachments in the TNEF format."
LICENSE = "GPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "ktnef-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "dc5d58608beae3a4cc2c770108620560f58bbf4e67c1052b3bc5fa64d75664e965f8e05c2806a9560467c41954cc3472584a5999a0416bf60f68d1657c256969"

RPROVIDES:${PN} += "application() application(org.kde.ktnef.desktop) ktnef ktnef(aarch-64) ktnef5 mimehandler(application/ms-tnef)"
RDEPENDS:${PN} += "kdepim-runtime ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKPim5Tnef.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
