SUMMARY = "Provides the interface and basic tools for the KDE workspace"
DESCRIPTION = "Provides the interface and basic tools for the KDE workspace."
LICENSE = "GPL-2.0-only"

PV = "5.27.4"

RPM_NAME = "kmenuedit5-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "688c02e0e6c3f8ef5cb2636937a02c18592a6c764f8cb05e0a8c43e07ad5ca757e2e0b13daccd7ec6ba13d06f14cfe8ecc0614589f7d0c01a8c3a6300747344a"

RPROVIDES:${PN} += "application() application(org.kde.kmenuedit.desktop) kmenuedit5 kmenuedit5(aarch-64) metainfo() metainfo(org.kde.kmenuedit.appdata.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5GlobalAccel.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5SonnetCore.so.5()(64bit) libKF5SonnetUi.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
