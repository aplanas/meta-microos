SUMMARY = "Virtual Osmocom GSM BTS (no RF hardware; GSMTAP/UDP)"
DESCRIPTION = "This version of OsmoBTS doesn't use actual GSM PHY/Hardware/RF, but \
utilizes GSMTAP-over-UDP frames for the Um interface.  This is useful \
in fully virtualized setups e.g. in combination with OsmocomBB virt_phy."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-bts-virtual-1.4.0-1.9.aarch64.rpm"
RPM_HASH = "b4d98765beebb3b49587ab8efa6f74bf4bfbcfc4598c69063125ebad0437a5ee322c1ddbe5d8b09806408dfd9988c66bd082c4360520e659dc19cf24c3976006"

RPROVIDES:${PN} += "config(osmo-bts-virtual) osmo-bts-virtual osmo-bts-virtual(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmoabis.so.10()(64bit) libosmocore.so.19()(64bit) libosmoctrl.so.0()(64bit) libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmotrau.so.2()(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
