SUMMARY = "Qt 6 CoAP Client Library"
DESCRIPTION = "Qt 6 library to implement a CoAP client."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Coap6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "1785231f36d9e27fc9f9b41af2891f7731c88adeb4e0ba047630cf42725c0fea2cc604bd62520e9a76b7ada704eac144df9e6cf3ca9ffb3f614f01a339afa5d0"

RPROVIDES:${PN} += "libQt6Coap.so.6()(64bit) libQt6Coap.so.6(Qt_6)(64bit) libQt6Coap.so.6(Qt_6.0)(64bit) libQt6Coap.so.6(Qt_6.1)(64bit) libQt6Coap.so.6(Qt_6.2)(64bit) libQt6Coap.so.6(Qt_6.3)(64bit) libQt6Coap.so.6(Qt_6.4)(64bit) libQt6Coap.so.6(Qt_6.5)(64bit) libQt6Coap.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Coap6 libQt6Coap6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Network.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
