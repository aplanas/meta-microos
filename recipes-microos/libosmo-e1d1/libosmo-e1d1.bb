SUMMARY = "Osmocom E1 daemon protocol library"
DESCRIPTION = "Osmocom E1 Daemon Protocol Library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "libosmo-e1d1-0.4.0-1.4.aarch64.rpm"
RPM_HASH = "f59548d86b764a7ccf6db26b8c0a6dfce16356af11912e43780188f30170a47e8c7a350f5fcc7c69765d38da7767d6c64032d65232a1257aedbb4e2aae132275"

RPROVIDES:${PN} += "libosmo-e1d.so.1()(64bit) libosmo-e1d1 libosmo-e1d1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
