SUMMARY = "Boost.System runtime library"
DESCRIPTION = "This package contains the Boost.System stub library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_system1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "ce3deac5bc2e896541cd995f24cd80d7b823031ea7dc1da992faa1aeba47753f64cd91dfd96c2f73d2d8302f9c1c39cb964c9c7430f0f506b5bce9b6c1ac6d44"

RPROVIDES:${PN} += "libboost_system.so.1.82.0()(64bit) libboost_system1_82_0 libboost_system1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0"

inherit rpm
