SUMMARY = "Osmocom GTP Hub: Proxy for GTP traffic between multiple SGSNs and GGSNs"
DESCRIPTION = "Osmocom GTP Hub: Proxy for GTP traffic between multiple SGSNs and GGSNs."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-gtphub-1.8.0-1.10.aarch64.rpm"
RPM_HASH = "99d38da12ccce3903ccf11e5cdac2fc539185838c9aa8326c436ce29a2db9dd93643bdaff2eab42e68c59e7693d54f1df663ee9be2a1cc580478bafb7517eedd"

RPROVIDES:${PN} += "config(osmo-gtphub) osmo-gtphub osmo-gtphub(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcares.so.2()(64bit) libgtp.so.6()(64bit) libosmo-sigtran.so.7()(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
