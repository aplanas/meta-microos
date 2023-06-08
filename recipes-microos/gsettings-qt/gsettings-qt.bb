SUMMARY = "QT bindings for GSettings"
DESCRIPTION = "Qt/QML bindings for GSettings."
LICENSE = "GPL-3.0+"

PV = "0.2"

RPM_NAME = "gsettings-qt-0.2-1.9.aarch64.rpm"
RPM_HASH = "96cdb59f73b36400974d2aaf787d4d6ccf14413dd66afea4844d18a7c39021c26e53cf8c78a09607f447a486bccbf1121a3786a5aede4cee1db4eb6d4b7c69ce"

RPROVIDES:${PN} += "gsettings-qt gsettings-qt(aarch-64) libGSettingsQmlPlugin.so()(64bit) qt5qmlimport(GSettings.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgsettings-qt.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
