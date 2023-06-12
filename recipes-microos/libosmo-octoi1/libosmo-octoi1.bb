SUMMARY = "Library for the Osmocom Community TDMoIP network"
DESCRIPTION = "Library for the Osmocom Community TDMoIP network."
LICENSE = "LGPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "libosmo-octoi1-0.5.0-1.1.aarch64.rpm"
RPM_HASH = "7ac1a453afdf4c20449bb5334a444247dc3b42fd4b5d01d2c7bba8c7b51ca4510773f333d1eecbf17d8fa228403868b460cc017c221666b31c2fc7e846bf0610"

RPROVIDES:${PN} += "libosmo-octoi.so.1()(64bit) libosmo-octoi1 libosmo-octoi1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.20()(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
