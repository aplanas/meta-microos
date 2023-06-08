SUMMARY = "Plugin framework for desktop services"
DESCRIPTION = "Provides a plugin framework for handling desktop services. Services can \
be applications or libraries. They can be bound to MIME types or handled by \
application specific code."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kservice-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "fcbc8cbcb60fd68ae582ca4b7f63a02ddee953d339a8c68ddd0ebc4cb2969615d7c085d067c6b6f41eb4e187737a1e1e2acaab1c0c4572506a6c968cd8fb24d1"

RPROVIDES:${PN} += "kservice kservice(aarch-64) libKF5Service.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
