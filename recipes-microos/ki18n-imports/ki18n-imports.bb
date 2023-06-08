SUMMARY = "QML components for ki18n Framework"
DESCRIPTION = "This package contains QML imports for the ki18n framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "ki18n-imports-5.105.0-1.2.aarch64.rpm"
RPM_HASH = "cdb0df6f1ab85c516e18da194fb51d5078a82dc02e87781886efa38118979bc645913e24bbc276bf3a922b694f3be7c2f140ed5ec2b0ed474c83c9c79899db2c"

RPROVIDES:${PN} += "ki18n-imports ki18n-imports(aarch-64) libki18nlocaledataqmlplugin.so()(64bit) qt5qmlimport(org.kde.i18n.localeData.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18nLocaleData.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
