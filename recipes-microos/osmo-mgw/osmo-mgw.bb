SUMMARY = "Osmocom's Media Gateway for 2G and 3G circuit-switched mobile networks"
DESCRIPTION = "OsmoMGW is Osmocom's Media Gateway for 2G and 3G circuit-switched mobile networks."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "osmo-mgw-1.9.0-1.9.aarch64.rpm"
RPM_HASH = "58bbb8a9b8980cfda465b15bb31e67569539831b2a98535ce7b4c78463bfe8aaada076e453dea93a8f5b4f7d741ffaa78226d2d36e9dfcd42a2d7c100bd00560"

RPROVIDES:${PN} += "config(osmo-mgw) osmo-mgw osmo-mgw(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmoabis.so.10()(64bit) libosmocore.so.19()(64bit) libosmoctrl.so.0()(64bit) libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmonetif.so.8()(64bit) libosmotrau.so.2()(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) systemd"

inherit rpm
