SUMMARY = "A sddm control module for KDE"
DESCRIPTION = "SDDM control module for KDE. It provides a graphical frontend for the \
sddm."
LICENSE = "GPL-2.0-only"

PV = "5.27.4"

RPM_NAME = "kcm_sddm-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "31700f0c1ab1002a48f0b0c798e119f8b19430c993cc6914c73e73c00816060d8ba4a8b07e993fd9915ca446b054f5f93d6fa46528a80cc6faf9ab7f81f7735d"

RPROVIDES:${PN} += "application() application(kcm_sddm.desktop) kcm_sddm kcm_sddm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5AuthCore.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5QuickAddons.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtGraphicalEffects.1) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Dialogs.1) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.Window.2) qt5qmlimport(org.kde.kcm.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.kitemmodels.1) qt5qmlimport(org.kde.newstuff.1)"

inherit rpm
