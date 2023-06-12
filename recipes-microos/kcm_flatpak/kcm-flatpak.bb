SUMMARY = "Flatpak Permissions Management KCM"
DESCRIPTION = "The KCM allows changing what permissions have been granted to installed Flatpak applications."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kcm_flatpak-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "fad4bfd0da59dbe7e906bc8db6fc10ef58fc881a9757ad5a72bb7eb913dfe6192575932d081ed16bacfc3baf6614c49355c83fbc29babbe85b2145af24e3f90c"

RPROVIDES:${PN} += "application() application(kcm_flatpak.desktop) kcm_flatpak kcm_flatpak(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5QuickAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libflatpak.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Dialogs.1) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kcm.1) qt5qmlimport(org.kde.kirigami.2) systemsettings5"

inherit rpm
