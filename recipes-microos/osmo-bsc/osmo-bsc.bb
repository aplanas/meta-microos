SUMMARY = "OsmoBSC: Osmocom's Base Station Controller for 2G CS mobile networks"
DESCRIPTION = "OsmoBSC: Osmocom's Base Station Controller for 2G circuit-switched mobile networks."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-1.8.0-1.10.aarch64.rpm"
RPM_HASH = "8e801c8026765f13c6e0da5102874654b842a70fc5fa15608fa8e461e4c1d102101a782f7e6e7728d390fb1f8eede6f1a46b2d830b851bd002dc232f768ee72d"

RPROVIDES:${PN} += "config(osmo-bsc) osmo-bsc osmo-bsc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmo-mgcp-client.so.9()(64bit) libosmo-sigtran.so.7()(64bit) libosmoabis.so.10()(64bit) libosmocore.so.19()(64bit) libosmoctrl.so.0()(64bit) libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmonetif.so.8()(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) systemd"

inherit rpm
