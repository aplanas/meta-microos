SUMMARY = "CLI utility to find ip.access compatible BTS"
DESCRIPTION = "Command line utility to find ip.access compatible BTS."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-abisip-find-1.8.0-1.10.aarch64.rpm"
RPM_HASH = "655de84f61ee0361e20326aed83a2ce739f28c9ea5d921546433b45ca508b384dcee16d14643390d6a2dfad760bf9f78bb3ce478cbf5e679214e327536a1d38c"

RPROVIDES:${PN} += "osmo-bsc-abisip-find osmo-bsc-abisip-find(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
