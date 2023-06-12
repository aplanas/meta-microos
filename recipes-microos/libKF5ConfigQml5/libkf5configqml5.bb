SUMMARY = "QtQuick bindings for configuration entities"
DESCRIPTION = "KConfigQml provides QtQuick bindings to KConfig, which allows using the library with \
QML."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5ConfigQml5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "16dfcf8569224aac09dbeabaa9077ba4d68f04603db2cd592c98ee9440cc80d782c2952bfb60dbbd5902def20429fe804b0e3d2c6d7b212cdb53f3672beebb8f"

RPROVIDES:${PN} += "libKF5ConfigQml.so.5()(64bit) libKF5ConfigQml5 libKF5ConfigQml5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core5 libQt5Gui5 libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Xml5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
