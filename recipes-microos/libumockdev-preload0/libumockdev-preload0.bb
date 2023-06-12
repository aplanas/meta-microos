SUMMARY = "Shared library for umockdev-preload"
DESCRIPTION = "umockdev mocks Linux devices for creating integration tests for hardware \
related libraries and programs. \
 \
This package provides the shared library for umockdev-preload."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.17"

RPM_NAME = "libumockdev-preload0-0.17.17-1.1.aarch64.rpm"
RPM_HASH = "035aeb71be6729524a86e75023de79207917935639fb5d5b5a674ede34aed2d91b8ed0cfc61fc89aff384f3a5a10642f5040dbd213a833c9c40db37a8ac00343"

RPROVIDES:${PN} += "libumockdev-preload.so.0()(64bit) \
libumockdev-preload0 \
libumockdev-preload0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
