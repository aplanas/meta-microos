SUMMARY = "RANAP User Adaption signalling library"
DESCRIPTION = "Osmocom code for the RANAP User Adaption signalling."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "libosmo-rua0-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "af999b3e234f8041b44fdc7087c247d7897634290b8387454c1a378b9ea52d075546972a0c5d4b201a3042fdfc827b3cf04a241e78973e6f934f9a38aa12070d"

RPROVIDES:${PN} += "libosmo-rua.so.0()(64bit) libosmo-rua0 libosmo-rua0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasn1c.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
