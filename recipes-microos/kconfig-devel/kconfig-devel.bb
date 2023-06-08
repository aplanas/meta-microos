SUMMARY = "KConfig Development files"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of two parts: \
KConfigCore and KConfigGui. \
 \
KConfigCore provides access to the configuration files themselves. It features: \
 \
- centralized definition: define your configuration in an XML file and use \
`kconfig_compiler` to generate classes to read and write configuration entries. \
 \
- lock-down (kiosk) support. \
 \
KConfigGui provides a way to hook widgets to the configuration so that they are \
automatically initialized from the configuration and automatically propagate \
their changes to their respective configuration files. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "kconfig-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "ce42940c5da8cd1d9c34e1f2f472cdfa5fbcd2f75e5f84744ee163a233924a90ec0e494927f2bbe0e1b3580f3bca3fb10b518f66fd38f8a303603a853f10a263"

RPROVIDES:${PN} += "cmake(KF5Config) kconfig-devel kconfig-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5DBus) cmake(Qt5Xml) extra-cmake-modules kconf_update5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore5 libKF5ConfigGui5 libKF5ConfigQml5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
