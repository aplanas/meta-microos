SUMMARY = "KDE's control center"
DESCRIPTION = "This package provides modules to control settings of Plasma and other \
applications by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "systemsettings5-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "e9f617730a2a0c8ef653413432ad87b82868c6321385322777b4ba8b6741049f9383fa2590ade3002040838b8d204c9db04ed1ea470a6b0decc8ad0a10458727"

RPROVIDES:${PN} += "application() application(kdesystemsettings.desktop) application(systemsettings.desktop) libsystemsettingsview.so.3()(64bit) metainfo() metainfo(org.kde.systemsettings.metainfo.xml) qt5qmlimport(org.kde.systemsettings.1) systemsettings5 systemsettings5(aarch-64) systemsettings5-zsh-completion"
RDEPENDS:${PN} += "/sbin/ldconfig kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Activities.so.5()(64bit) libKF5Auth.so.5()(64bit) libKF5AuthCore.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5ItemModels.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Kirigami2.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5Package.so.5()(64bit) libKF5Runner.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickWidgets.so.5()(64bit) libQt5QuickWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkworkspace5.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.systemsettings.1)"

inherit rpm
