SUMMARY = "Base station controller for a GSM stack"
DESCRIPTION = "An implementation of the minimal subset of the major backend \
components of a GSM network, such as BSC, MSC, HLR, EIR. Using a \
commercial GSM BTS and attaching it to a Linux system running the \
OpenBSC software allows you to run your own GSM 'network in a box'. \
 \
OsmoBSC can run in one of two modes: \
* as OsmoBSC, exposing an A interface towards an external MSC, or \
* as OsmoNITB (Network In The Box), which implements a minimal subset \
  of the BSC, MSC. SMSC and HLR"
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "openbsc-1.4.1-1.9.aarch64.rpm"
RPM_HASH = "78122afba5dc7595575bf33d2951dbc544591619f96a811b691f270a4cd18126d7f24c2d952ded76d3f89fd50aa73cbd8dace2948cc473e9c1d960f9876be768"

RPROVIDES:${PN} += "config(openbsc) openbsc openbsc(aarch-64) osmocom-bsc-sccplite osmocom-nitb"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit) libdbi-drivers-dbd-sqlite3 libdbi.so.3()(64bit) libdbi.so.3(ABI_3)(64bit) libosmoabis.so.10()(64bit) libosmocore.so.19()(64bit) libosmoctrl.so.0()(64bit) libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmovty.so.9()(64bit) libsmpp34.so.1()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
