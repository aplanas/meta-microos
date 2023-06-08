SUMMARY = "Osmocom Remote SIM Bank Daemon"
DESCRIPTION = "The remsim-bankd is managing a bank of SIM card readers and their \
respective cards. It establishes a control connection to remsim-server \
and receives inbound connections from remsim-clients."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "osmo-remsim-bankd-0.2.2-1.20.aarch64.rpm"
RPM_HASH = "630e752fecc62db94db262d1b3226af760e9b1dd767738529b53edf3033fd952c7274d89f023c222120194eb86162a0dafca1d89250145f5112377c82c028ab6"

RPROVIDES:${PN} += "osmo-remsim-bankd osmo-remsim-bankd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcsv.so.3()(64bit) libosmo-rspro.so.1()(64bit) libosmoabis.so.10()(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libpcsclite.so.1()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
