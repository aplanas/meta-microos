SUMMARY = "QtQuick bindings for classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. KCModules can be \
created with the KConfigWidgets framework. This package provides QtQuick bindings \
for the KCMUtils libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kcmutils-imports-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "2542a0fef4f24ce317e0c370412c3833eed33cfc3c204bd7305ffb9e284a5eae12291f4c0c42ff3dd097265f4ffc62acce23645e14d1c1f7220a5352ffdc9a33"

RPROVIDES:${PN} += "kcmutils-imports kcmutils-imports(aarch-64) libkcmutilsqmlplugin.so()(64bit) qt5qmlimport(org.kde.kcmutils.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ItemViews.so.5()(64bit) libKF5KCMUtils5 libKF5KCMUtilsCore5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.kcm.1) qt5qmlimport(org.kde.kirigami.2)"

inherit rpm
