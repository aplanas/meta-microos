SUMMARY = "GPRS Support Node"
DESCRIPTION = "Osmo-GGSN is a C-language implementation of a GGSN (Gateway GPRS \
Support Node), a core network element of ETSI/3GPP cellular networks \
such as GPRS, EDGE, UMTS or HSPA."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.9.0"

RPM_NAME = "osmo-ggsn-1.9.0-1.4.aarch64.rpm"
RPM_HASH = "a6d4960986040228d1e2392673df11bec3c1216a49f9253d91b234484d3c47acb09171b5f07cd5e0d64e0020d63dfa0223e53dc9d3d69c721acb5fe542b60ba1"

RPROVIDES:${PN} += "config(osmo-ggsn) osmo-ggsn osmo-ggsn(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgtp.so.6()(64bit) libgtpnl.so.0()(64bit) libgtpnl.so.0(LIBGTPNL_1.0)(64bit) libosmocore.so.19()(64bit) libosmoctrl.so.0()(64bit) libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
