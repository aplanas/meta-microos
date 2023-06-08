SUMMARY = "Examples for the qt6-grpc modules"
DESCRIPTION = "Examples for the qt6-grpc modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-grpc-examples-6.5.0-1.3.aarch64.rpm"
RPM_HASH = "afd020592138a16d4f99273c24fcf439552d94449d3c738b641ae75dd742bcd4062c8b68f791b10d4360ed9d630429bf9d2a1db6c00b52b09acdff68e3a2b2d2"

RPROVIDES:${PN} += "libprotobuf_sensors.so()(64bit) qt6-grpc-examples qt6-grpc-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Grpc.so.6()(64bit) libQt6Grpc.so.6(Qt_6)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Network.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Protobuf.so.6()(64bit) libQt6Protobuf.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgpr.so.31()(64bit) libgrpc++.so.1.54()(64bit) libgrpc.so.31()(64bit) libprotobuf-3.21.12.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
