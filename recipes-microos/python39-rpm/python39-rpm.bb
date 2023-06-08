SUMMARY = "Python Bindings for Manipulating RPM Packages"
DESCRIPTION = "This package contains a module that permits applications written in \
the Python programming language to use the interface supplied by \
RPM Package Manager libraries. \
 \
This package should be installed if you want to develop Python programs \
that will manipulate RPM packages and databases."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "python39-rpm-4.18.0-4.3.aarch64.rpm"
RPM_HASH = "5f40bb53f8c91d04c5c5173c647ce7767ce55a09341c5abe41152ab17d202bee21331b0e589d8df28d34c52ed20db903b51d4173f28ca29c134d4f594b697c93"

RPROVIDES:${PN} += "python3.9dist(rpm) python39-rpm python39-rpm(aarch-64) python3dist(rpm)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit) librpm.so.9()(64bit) librpmbuild.so.9()(64bit) librpmio.so.9()(64bit) librpmsign.so.9()(64bit) python(abi) rpm"

inherit rpm
