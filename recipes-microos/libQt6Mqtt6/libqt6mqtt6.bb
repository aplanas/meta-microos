SUMMARY = "Qt 6 MQTT library"
DESCRIPTION = "Qt library to implement MQTT protocol version 3.1 and 3.1.1"
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "libQt6Mqtt6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "6baf85fc9079e8e73aec9eaddb651ea28b4581bb5be9587d6a6f94e1f78658eeda1fb343fbcec381f2c48544fef64b5623833228ada0ea6dbd54ba9b0d4438df"

RPROVIDES:${PN} += "libQt6Mqtt.so.6()(64bit) libQt6Mqtt.so.6(Qt_6)(64bit) libQt6Mqtt.so.6(Qt_6.0)(64bit) libQt6Mqtt.so.6(Qt_6.1)(64bit) libQt6Mqtt.so.6(Qt_6.2)(64bit) libQt6Mqtt.so.6(Qt_6.3)(64bit) libQt6Mqtt.so.6(Qt_6.4)(64bit) libQt6Mqtt.so.6(Qt_6.5)(64bit) libQt6Mqtt.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Mqtt6 libQt6Mqtt6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
