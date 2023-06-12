SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
QML imports."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "solid-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "5530ccfee819edb420541e991042d9bba3c3e84249a64b88063f3ecdc51dc7aeabbfb5f55cfc7ed7bbc6045feeab55f973783937773f3121c7132ae249a9a8f1"

RPROVIDES:${PN} += "libsolidextensionplugin.so()(64bit) \
qt5qmlimport(org.kde.solid.1) \
solid-imports \
solid-imports(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Solid.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
