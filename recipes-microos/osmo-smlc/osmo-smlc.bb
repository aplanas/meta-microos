SUMMARY = "Osmocom Serving Mobile Location Centre"
DESCRIPTION = "OsmoSMLC is the Osmocom Serving Mobile Location Centre. It implements \
the SMLC functionality as specified in 3GPP networks \
Location_Services architecture."
LICENSE = "AGPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "osmo-smlc-0.2.3-1.1.aarch64.rpm"
RPM_HASH = "7d9774d45ea11c9367f3512e5e91d6dcb1d88001b8c8bee2c9ec45371505e71cf4fd0178fd69e665d3ea59769095ef5212f514cb22c5ddb3c2f10dc1ed28f572"

RPROVIDES:${PN} += "osmo-smlc osmo-smlc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmo-sigtran.so.7()(64bit) libosmocore.so.20()(64bit) libosmoctrl.so.0()(64bit) libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
