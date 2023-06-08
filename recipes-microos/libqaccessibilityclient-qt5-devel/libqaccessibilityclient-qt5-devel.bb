SUMMARY = "Accessibilty tools helper library, used e.g. by screen readers"
DESCRIPTION = "This library is used when writing accessibility clients such as screen readers. \
It comes with some examples demonstrating the API. These small helpers may be \
useful when testing accessibility. One of them writes all accessibiliy \
interfaces an application provides as text output. The other, more advanced \
application shows a tree of objects and allows some interaction and \
exploration."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "0.4.1"

RPM_NAME = "libqaccessibilityclient-qt5-devel-0.4.1-1.11.aarch64.rpm"
RPM_HASH = "5f4f765ee794a5966bf9b09b2a748d41cb67f73dc281e8763461a1ed73fc5c72fcfd9b52f90c11c808a9885f880684ec00bc35dad9e33c0ad7a0d617fde055bb"

RPROVIDES:${PN} += "cmake(QAccessibilityClient) libqaccessibilityclient-qt5-devel libqaccessibilityclient-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) extra-cmake-modules ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libqaccessibilityclient-qt5-0 libqaccessibilityclient-qt5.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
