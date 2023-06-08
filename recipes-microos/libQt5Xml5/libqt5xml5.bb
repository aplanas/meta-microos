SUMMARY = "Qt 5 Xml Library"
DESCRIPTION = "The Qt XML module provides C++ implementations of the SAX and DOM \
standards for XML."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Xml5-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "21c7ef76374c0984199485c0bf1ab492db56d911ea2d4e04dfda8cfd50cf4f6c05afa374057785c5eef96ab26c6ac2e303b0f690ccb69eeeced5b7e35367c538"

RPROVIDES:${PN} += "libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libQt5Xml.so.5(Qt_5.0)(64bit) libQt5Xml.so.5(Qt_5.1)(64bit) libQt5Xml.so.5(Qt_5.10)(64bit) libQt5Xml.so.5(Qt_5.11)(64bit) libQt5Xml.so.5(Qt_5.12)(64bit) libQt5Xml.so.5(Qt_5.13)(64bit) libQt5Xml.so.5(Qt_5.14)(64bit) libQt5Xml.so.5(Qt_5.15)(64bit) libQt5Xml.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Xml.so.5(Qt_5.2)(64bit) libQt5Xml.so.5(Qt_5.3)(64bit) libQt5Xml.so.5(Qt_5.4)(64bit) libQt5Xml.so.5(Qt_5.5)(64bit) libQt5Xml.so.5(Qt_5.6)(64bit) libQt5Xml.so.5(Qt_5.7)(64bit) libQt5Xml.so.5(Qt_5.8)(64bit) libQt5Xml.so.5(Qt_5.9)(64bit) libQt5Xml5 libQt5Xml5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Core5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.28)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
