SUMMARY = "Tools for managing print jobs and printers"
DESCRIPTION = "kde-print-manager provides tools for managing print jobs and printers."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kde-print-manager-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "3939412e95277a3da34d11e916934d9237de44f7f85aa371d468d8f2b6785d2f165441078adb814703fcc6688c63409ad5b201bec1fd4938f6bd7d81b79e5191"

RPROVIDES:${PN} += "application() application(kcm_printer_manager.desktop) application(org.kde.ConfigurePrinter.desktop) application(org.kde.PrintQueue.desktop) application(org.kde.kde-add-printer.desktop) dbus(com.redhat.NewPrinterNotification) kde-print-manager kde-print-manager(aarch-64) libkcupslib.so()(64bit) libprintmanager.so()(64bit) metainfo() metainfo(org.kde.plasma.printmanager.appdata.xml) metainfo(org.kde.print-manager.metainfo.xml) print-manager5 qt5qmlimport(org.kde.plasma.printmanager.0)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcups.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.1) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(org.kde.kquickcontrolsaddons.2) qt5qmlimport(org.kde.plasma.components.3) qt5qmlimport(org.kde.plasma.core.2) qt5qmlimport(org.kde.plasma.extras.2) qt5qmlimport(org.kde.plasma.plasmoid.2) qt5qmlimport(org.kde.plasma.printmanager.0)"

inherit rpm
