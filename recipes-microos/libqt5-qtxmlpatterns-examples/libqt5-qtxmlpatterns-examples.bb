SUMMARY = "Qt5 xmlpatterns examples"
DESCRIPTION = "Examples for the libqt5-qtxmlpatterns module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtxmlpatterns-examples-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "3acbd7666ea6e640eebbb433f2c871d24ea829ca732c859bba3fef7132459ea7ce124d52ac333e6de4731e06bbb0a8ca791a6589df91d8f9aad3b14561faaac1"

RPROVIDES:${PN} += "libqt5-qtxmlpatterns-examples libqt5-qtxmlpatterns-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5XmlPatterns.so.5()(64bit) libQt5XmlPatterns.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
