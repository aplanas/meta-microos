SUMMARY = "Osmocom's Media Gateway for 2G and 3G circuit-switched mobile networks"
DESCRIPTION = "OsmoMGW is Osmocom's Media Gateway for 2G and 3G circuit-switched mobile networks."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "osmo-mgw-1.9.0-1.10.aarch64.rpm"
RPM_HASH = "cd2176d40b95b4c5c3fe34a2bad3e273421cd7cb42f7dd7fdae421d27ddf940255efb1e1e0ea8375afd6a55c717c92120175653040c07a0e4746d7980c59cd99"

RPROVIDES:${PN} += "config(osmo-mgw) osmo-mgw osmo-mgw(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmoabis.so.10()(64bit) libosmocore.so.20()(64bit) libosmoctrl.so.0()(64bit) libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmoisdn.so.0()(64bit) libosmoisdn.so.0(LIBOSMOISDN_1.0)(64bit) libosmonetif.so.11()(64bit) libosmotrau.so.2()(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) systemd"

inherit rpm
