SUMMARY = "Qt 5 Test Library"
DESCRIPTION = "Qt Test is a framework for unit testing Qt based applications and \
libraries. Qt Test provides functionality commonly found in unit \
testing frameworks as well as extensions for testing graphical user \
interfaces."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Test5-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "113fdf4e8fe0ee6bf9b5fed746cf0c09f1c3606a49a1c904bc6b4dc9263ff2b26e7b0db701a0e34cc9e4e3ac878f1f126baea17c3811ee65997c099dc8d8f65d"

RPROVIDES:${PN} += "libQt5Test.so.5()(64bit) libQt5Test.so.5(Qt_5)(64bit) libQt5Test.so.5(Qt_5.0)(64bit) libQt5Test.so.5(Qt_5.1)(64bit) libQt5Test.so.5(Qt_5.10)(64bit) libQt5Test.so.5(Qt_5.11)(64bit) libQt5Test.so.5(Qt_5.12)(64bit) libQt5Test.so.5(Qt_5.13)(64bit) libQt5Test.so.5(Qt_5.14)(64bit) libQt5Test.so.5(Qt_5.15)(64bit) libQt5Test.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Test.so.5(Qt_5.2)(64bit) libQt5Test.so.5(Qt_5.3)(64bit) libQt5Test.so.5(Qt_5.4)(64bit) libQt5Test.so.5(Qt_5.5)(64bit) libQt5Test.so.5(Qt_5.6)(64bit) libQt5Test.so.5(Qt_5.7)(64bit) libQt5Test.so.5(Qt_5.8)(64bit) libQt5Test.so.5(Qt_5.9)(64bit) libQt5Test5 libQt5Test5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Core5 libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit)"

inherit rpm
