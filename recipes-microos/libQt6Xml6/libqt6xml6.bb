SUMMARY = "Qt 6 XML library"
DESCRIPTION = "The Qt XML module provides C++ implementations of the SAX and DOM \
standards for XML."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "libQt6Xml6-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "820d9b40f6c7a1c5d05a17ac2819c7c1389ae39afc7bbbf61f1447386b8d73d71d39c5e8227b15ece1d690d63e0f40662b13d8613cbab44e1289b855b10f4234"

RPROVIDES:${PN} += "libQt6Xml.so.6()(64bit) libQt6Xml.so.6(Qt_6)(64bit) libQt6Xml.so.6(Qt_6.0)(64bit) libQt6Xml.so.6(Qt_6.1)(64bit) libQt6Xml.so.6(Qt_6.2)(64bit) libQt6Xml.so.6(Qt_6.3)(64bit) libQt6Xml.so.6(Qt_6.4)(64bit) libQt6Xml.so.6(Qt_6.5)(64bit) libQt6Xml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Xml6 libQt6Xml6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core6 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.28)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
