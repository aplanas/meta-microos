SUMMARY = "Osmocom Home Location Register for GSUP protocol towards OsmoSGSN and OsmoCSCN"
DESCRIPTION = "The GSUP HLR is a stand-alone HLR (Home Location Register) for SIM \
and USIM based subscribers which exposes the GSUP protocol towards \
its users. OsmoSGSN supports this protocol. \
 \
osmo-gsup-hlr is still very simplistic. It is a single-threaded \
architecture and uses only sqlite3 tables as back-end.  It is suitable \
for installations of the scale that OsmoNITB was able to handle.  It \
also lacks various features like fine-grained control of subscribed \
services (like supplementary services)."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-hlr-1.4.0-1.10.aarch64.rpm"
RPM_HASH = "132d9fcbd74e0782d46901fc125cab09a67882b449458076ec0f90bf58a160c4be49d31cfc1b8900603bff369f93719ebb279e0f495e7644b0e08ee4aa892565"

RPROVIDES:${PN} += "config(osmo-hlr) osmo-hlr osmo-hlr(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbi-drivers-dbd-sqlite3 libosmo-gsup-client.so.0()(64bit) libosmo-mslookup.so.0()(64bit) libosmoabis.so.10()(64bit) libosmocore.so.19()(64bit) libosmoctrl.so.0()(64bit) libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmovty.so.9()(64bit) libsqlite3.so.0()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
