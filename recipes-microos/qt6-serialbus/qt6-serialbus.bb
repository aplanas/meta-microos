SUMMARY = "Qt 6 SerialBus library"
DESCRIPTION = "Qt 6 SerialBus library."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-serialbus-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "5293e50c8bc232f695e268009bae10b86dfeadcfc2266903ac917d155deda6ffb518473eea8d9a4cc79797b6a558b972576e88f15a4816121296a4f69a88b655"

RPROVIDES:${PN} += "libqtpassthrucanbus.so()(64bit) libqtpassthrucanbus.so(Qt_6)(64bit) libqtpassthrucanbus.so(Qt_6.0)(64bit) libqtpassthrucanbus.so(Qt_6.1)(64bit) libqtpassthrucanbus.so(Qt_6.2)(64bit) libqtpassthrucanbus.so(Qt_6.3)(64bit) libqtpassthrucanbus.so(Qt_6.4)(64bit) libqtpassthrucanbus.so(Qt_6.5)(64bit) libqtpassthrucanbus.so(Qt_6.5.0_PRIVATE_API)(64bit) libqtpeakcanbus.so()(64bit) libqtpeakcanbus.so(Qt_6)(64bit) libqtpeakcanbus.so(Qt_6.0)(64bit) libqtpeakcanbus.so(Qt_6.1)(64bit) libqtpeakcanbus.so(Qt_6.2)(64bit) libqtpeakcanbus.so(Qt_6.3)(64bit) libqtpeakcanbus.so(Qt_6.4)(64bit) libqtpeakcanbus.so(Qt_6.5)(64bit) libqtpeakcanbus.so(Qt_6.5.0_PRIVATE_API)(64bit) libqtsocketcanbus.so()(64bit) libqtsocketcanbus.so(Qt_6)(64bit) libqtsocketcanbus.so(Qt_6.0)(64bit) libqtsocketcanbus.so(Qt_6.1)(64bit) libqtsocketcanbus.so(Qt_6.2)(64bit) libqtsocketcanbus.so(Qt_6.3)(64bit) libqtsocketcanbus.so(Qt_6.4)(64bit) libqtsocketcanbus.so(Qt_6.5)(64bit) libqtsocketcanbus.so(Qt_6.5.0_PRIVATE_API)(64bit) libqttinycanbus.so()(64bit) libqttinycanbus.so(Qt_6)(64bit) libqttinycanbus.so(Qt_6.0)(64bit) libqttinycanbus.so(Qt_6.1)(64bit) libqttinycanbus.so(Qt_6.2)(64bit) libqttinycanbus.so(Qt_6.3)(64bit) libqttinycanbus.so(Qt_6.4)(64bit) libqttinycanbus.so(Qt_6.5)(64bit) libqttinycanbus.so(Qt_6.5.0_PRIVATE_API)(64bit) libqtvirtualcanbus.so()(64bit) libqtvirtualcanbus.so(Qt_6)(64bit) libqtvirtualcanbus.so(Qt_6.0)(64bit) libqtvirtualcanbus.so(Qt_6.1)(64bit) libqtvirtualcanbus.so(Qt_6.2)(64bit) libqtvirtualcanbus.so(Qt_6.3)(64bit) libqtvirtualcanbus.so(Qt_6.4)(64bit) libqtvirtualcanbus.so(Qt_6.5)(64bit) libqtvirtualcanbus.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-serialbus qt6-serialbus(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6SerialBus.so.6()(64bit) libQt6SerialBus.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
