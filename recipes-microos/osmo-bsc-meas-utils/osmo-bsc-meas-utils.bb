SUMMARY = "Command line utilities for OsmoBSC's measurement reports"
DESCRIPTION = "This package contains utilities for handling OsmoBSC's measurement reports \
 * meas_json to convert measurement feed into a JSON feed"
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-meas-utils-1.8.0-1.10.aarch64.rpm"
RPM_HASH = "5bc86e91b081211c5525602992531b728879a19a57ab8e646c516276a0723090027154e69ed7d4ba123e1488d6c75961a4de09f8d05146690a5e5a802f5c901a"

RPROVIDES:${PN} += "osmo-bsc-meas-utils osmo-bsc-meas-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmo-mgcp-client.so.9()(64bit) libosmo-sigtran.so.7()(64bit) libosmoabis.so.10()(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmonetif.so.8()(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
