SUMMARY = "Library for the Osmocom Community TDMoIP network"
DESCRIPTION = "Library for the Osmocom Community TDMoIP network."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "libosmo-octoi0-0.4.0-1.4.aarch64.rpm"
RPM_HASH = "1c9f865e81ea2a08896d30fee63341226f7985526244597224d57fba3c8c03fd7be755d72dfd011aa55fce81679efa1fb8c0ee0db9277b27e4fbda5c252bab1f"

RPROVIDES:${PN} += "libosmo-octoi.so.0()(64bit) libosmo-octoi0 libosmo-octoi0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
