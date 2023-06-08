SUMMARY = "Qt 5 Print Support Library"
DESCRIPTION = "An abstraction over the platform-specific printing systems. Using \
this library, Qt applications can print to attached printers and \
across networks to remote printers. Qt's printing system also \
supports PDF file generation, providing the foundation for basic \
report generation facilities."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5PrintSupport5-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "0d207b564b3dd7a857e210cdbc4a4832807732dbd58a13c3531ea1a39eee0507b2a6916b1d0828702079e6799517f995712fe2404e64be34220c3f6ca8818687"

RPROVIDES:${PN} += "libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5(Qt_5.0)(64bit) libQt5PrintSupport.so.5(Qt_5.1)(64bit) libQt5PrintSupport.so.5(Qt_5.10)(64bit) libQt5PrintSupport.so.5(Qt_5.11)(64bit) libQt5PrintSupport.so.5(Qt_5.12)(64bit) libQt5PrintSupport.so.5(Qt_5.13)(64bit) libQt5PrintSupport.so.5(Qt_5.14)(64bit) libQt5PrintSupport.so.5(Qt_5.15)(64bit) libQt5PrintSupport.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5PrintSupport.so.5(Qt_5.2)(64bit) libQt5PrintSupport.so.5(Qt_5.3)(64bit) libQt5PrintSupport.so.5(Qt_5.4)(64bit) libQt5PrintSupport.so.5(Qt_5.5)(64bit) libQt5PrintSupport.so.5(Qt_5.6)(64bit) libQt5PrintSupport.so.5(Qt_5.7)(64bit) libQt5PrintSupport.so.5(Qt_5.8)(64bit) libQt5PrintSupport.so.5(Qt_5.9)(64bit) libQt5PrintSupport5 libQt5PrintSupport5(aarch-64) libcupsprintersupport.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Widgets5 libc.so.6(GLIBC_2.17)(64bit) libcups.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
