SUMMARY = "Plugin framework for desktop services"
DESCRIPTION = "Provides a plugin framework for handling desktop services. Services can \
be applications or libraries. They can be bound to MIME types or handled by \
application specific code."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kservice-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "d104e5518a7e30fbd510691e7be6a0d632289141b8b8f170d7b73b3831e7741fb95ddf879cbb8aef9e79a825cd1e9ba65033edf02b849c248d7686c6f87650f3"

RPROVIDES:${PN} += "kservice kservice(aarch-64) libKF5Service.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
