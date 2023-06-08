SUMMARY = "Network service discovery using Zeroconf"
DESCRIPTION = "KDNSSD is a library for handling the DNS-based Service Discovery Protocol \
(DNS-SD), the layer of Zeroconf that allows network \
services, such as printers, to be discovered without any user intervention or \
centralized infrastructure. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kdnssd-framework-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "55c3aa15984cffaa996cb35236101d3c4fedbb8969503294e924c9304ecde1c965222ec7accb20c1f85f0333268dd386f5d8cbc0e07eb2d246d0a9ee29a6923a"

RPROVIDES:${PN} += "cmake(KF5DNSSD) kdnssd-framework-devel kdnssd-framework-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Network) extra-cmake-modules libKF5DNSSD5"

inherit rpm
