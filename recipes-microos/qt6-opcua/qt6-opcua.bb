SUMMARY = "Qt wrapper for existing OPC UA stacks"
DESCRIPTION = "Qt API to interact with OPC UA (Open Platform Communications Unified \
Architecture) on top of a 3rd party OPC UA stack."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-opcua-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "d5b6cd28d6a7c62350564290285ae09d1b182ca370557edfcf3341d808aae2227c903c58706b3115e61d5be99fb9fc6e9b71b6e7e2b08735c3e0e13ee8d56d84"

RPROVIDES:${PN} += "libopen62541_backend.so()(64bit) libopen62541_backend.so(Qt_6)(64bit) libopen62541_backend.so(Qt_6.0)(64bit) libopen62541_backend.so(Qt_6.1)(64bit) libopen62541_backend.so(Qt_6.2)(64bit) libopen62541_backend.so(Qt_6.3)(64bit) libopen62541_backend.so(Qt_6.4)(64bit) libopen62541_backend.so(Qt_6.5)(64bit) libopen62541_backend.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-opcua qt6-opcua(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6OpcUa.so.6()(64bit) libQt6OpcUa.so.6(Qt_6)(64bit) libQt6OpcUa.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
