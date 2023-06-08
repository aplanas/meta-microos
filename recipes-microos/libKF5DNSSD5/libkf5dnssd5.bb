SUMMARY = "Network service discovery using Zeroconf"
DESCRIPTION = "KDNSSD is a library for handling the DNS-based Service Discovery Protocol \
(DNS-SD), the layer of Zeroconf that allows network \
services, such as printers, to be discovered without any user intervention or \
centralized infrastructure."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5DNSSD5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "66b875100a37d62928ca1dfc31ee4cded39f6edc0a4ef487a323670ec555bc677b663c9251a8120832700573760542a7f15f0a6eb31bb2200f4cbb881ac8ae59"

RPROVIDES:${PN} += "libKF5DNSSD.so.5()(64bit) libKF5DNSSD5 libKF5DNSSD5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5DBus5 libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Network5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
