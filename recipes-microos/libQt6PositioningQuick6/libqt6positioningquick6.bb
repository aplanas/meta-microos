SUMMARY = "Qt 6 PositioningQuick library"
DESCRIPTION = "The Qt 6 PositioningQuick library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6PositioningQuick6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "4a126c90e5d5d7de1c1b011a0fe808ca83a9ba684bf74aaf2e2e8429b8ac7e845c8f47dc9bf606a77ee73f7f76e25a68e6269c5019f0b2d1c6a28cc2d43aca21"

RPROVIDES:${PN} += "libQt6PositioningQuick.so.6()(64bit) libQt6PositioningQuick.so.6(Qt_6)(64bit) libQt6PositioningQuick.so.6(Qt_6.0)(64bit) libQt6PositioningQuick.so.6(Qt_6.1)(64bit) libQt6PositioningQuick.so.6(Qt_6.2)(64bit) libQt6PositioningQuick.so.6(Qt_6.3)(64bit) libQt6PositioningQuick.so.6(Qt_6.4)(64bit) libQt6PositioningQuick.so.6(Qt_6.5)(64bit) libQt6PositioningQuick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6PositioningQuick6 libQt6PositioningQuick6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Positioning.so.6()(64bit) libQt6Positioning.so.6(Qt_6)(64bit) libQt6Positioning.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
