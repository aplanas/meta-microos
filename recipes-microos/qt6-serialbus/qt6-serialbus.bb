SUMMARY = "Qt 6 SerialBus library"
DESCRIPTION = "Qt 6 SerialBus library."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-serialbus-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4dfd85353e815fba99014510b074c7235c9ef40acbb21ca07851ae07454a485bce929679e2c4483a0612e7f66b336e14218176a3da404c2c051420d485e7bb8f"

RPROVIDES:${PN} += "libqtpassthrucanbus.so()(64bit) libqtpassthrucanbus.so(Qt_6)(64bit) libqtpassthrucanbus.so(Qt_6.0)(64bit) libqtpassthrucanbus.so(Qt_6.1)(64bit) libqtpassthrucanbus.so(Qt_6.2)(64bit) libqtpassthrucanbus.so(Qt_6.3)(64bit) libqtpassthrucanbus.so(Qt_6.4)(64bit) libqtpassthrucanbus.so(Qt_6.5)(64bit) libqtpassthrucanbus.so(Qt_6.5.1_PRIVATE_API)(64bit) libqtpeakcanbus.so()(64bit) libqtpeakcanbus.so(Qt_6)(64bit) libqtpeakcanbus.so(Qt_6.0)(64bit) libqtpeakcanbus.so(Qt_6.1)(64bit) libqtpeakcanbus.so(Qt_6.2)(64bit) libqtpeakcanbus.so(Qt_6.3)(64bit) libqtpeakcanbus.so(Qt_6.4)(64bit) libqtpeakcanbus.so(Qt_6.5)(64bit) libqtpeakcanbus.so(Qt_6.5.1_PRIVATE_API)(64bit) libqtsocketcanbus.so()(64bit) libqtsocketcanbus.so(Qt_6)(64bit) libqtsocketcanbus.so(Qt_6.0)(64bit) libqtsocketcanbus.so(Qt_6.1)(64bit) libqtsocketcanbus.so(Qt_6.2)(64bit) libqtsocketcanbus.so(Qt_6.3)(64bit) libqtsocketcanbus.so(Qt_6.4)(64bit) libqtsocketcanbus.so(Qt_6.5)(64bit) libqtsocketcanbus.so(Qt_6.5.1_PRIVATE_API)(64bit) libqttinycanbus.so()(64bit) libqttinycanbus.so(Qt_6)(64bit) libqttinycanbus.so(Qt_6.0)(64bit) libqttinycanbus.so(Qt_6.1)(64bit) libqttinycanbus.so(Qt_6.2)(64bit) libqttinycanbus.so(Qt_6.3)(64bit) libqttinycanbus.so(Qt_6.4)(64bit) libqttinycanbus.so(Qt_6.5)(64bit) libqttinycanbus.so(Qt_6.5.1_PRIVATE_API)(64bit) libqtvirtualcanbus.so()(64bit) libqtvirtualcanbus.so(Qt_6)(64bit) libqtvirtualcanbus.so(Qt_6.0)(64bit) libqtvirtualcanbus.so(Qt_6.1)(64bit) libqtvirtualcanbus.so(Qt_6.2)(64bit) libqtvirtualcanbus.so(Qt_6.3)(64bit) libqtvirtualcanbus.so(Qt_6.4)(64bit) libqtvirtualcanbus.so(Qt_6.5)(64bit) libqtvirtualcanbus.so(Qt_6.5.1_PRIVATE_API)(64bit) qt6-serialbus qt6-serialbus(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6SerialBus.so.6()(64bit) libQt6SerialBus.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
