SUMMARY = "Development files for kdsoap, a Qt-based client and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides development headers to use KD Soap in Qt based \
applications."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "kdsoap-qt6-devel-2.1.1-1.3.aarch64.rpm"
RPM_HASH = "5f5cebcb91fa683749c984aa0a339e888cfef542b054d58d7a6c0e55ace75712c0ff1d7b99e8b8c7db8e946f80cf2d13d40d676cbda63dac29cdb71d2e568225"

RPROVIDES:${PN} += "cmake(KDSoap-qt6) kdsoap-qt6-devel kdsoap-qt6-devel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.4)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Xml.so.6()(64bit) libQt6Xml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libkdsoap-qt6-2 libkdsoap-server-qt6-2 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
