SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "knewstuff-imports-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "c3a027a4881241d0632125563a2441bda6f2b7ce9903075ce11006e5f6011d878654eeb2e470ce50be16236a25fae1dff76e40d5e342e67a9bc7e08e8a63048a"

RPROVIDES:${PN} += "knewstuff-imports knewstuff-imports(aarch-64) libnewstuffqmlplugin.so()(64bit) qt5qmlimport(org.kde.newstuff.1) qt5qmlimport(org.kde.newstuff.core.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5NewStuffCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtGraphicalEffects.1) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.Templates.2) qt5qmlimport(QtQuick.Window.2) qt5qmlimport(org.kde.kcm.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.newstuff.1) qt5qmlimport(org.kde.newstuff.core.1)"

inherit rpm
