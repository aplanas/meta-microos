SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
QML imports."
LICENSE = "GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "kactivities5-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "9f810f8a28d0a516a34356b2fb6f2e44d6725ced933e459a1746159d5508cc480d5ae97096e26227a9f3a6ea10a77d13ce3c72e60ff26df3fe8e7a3e7920d389"

RPROVIDES:${PN} += "kactivities5-imports kactivities5-imports(aarch-64) libkactivitiesextensionplugin.so()(64bit) qt5qmlimport(org.kde.activities.0)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Activities.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
