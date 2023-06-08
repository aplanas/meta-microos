SUMMARY = "Zeroconf Support for KIO applications"
DESCRIPTION = "This package adds Zeroconf support to KIO, allowing the use of this protocol \
in all applications that are using KIO."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdnssd-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "9bd7083b07d98b36549872dcdf63594c14bf3a7949c823ccfd14e450f9cfdcc63e3d661d54c1408a53cffb768813fb1a56a246d35d8cd22091a0d5a15b0406bb"

RPROVIDES:${PN} += "kdnssd kdnssd(aarch-64) metainfo() metainfo(org.kde.kio_zeroconf.metainfo.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5DNSSD.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
