SUMMARY = "Command line utilities for OsmoBSC's measurement reports"
DESCRIPTION = "This package contains utilities for handling OsmoBSC's measurement reports \
 * meas_json to convert measurement feed into a JSON feed"
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-meas-utils-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "35a9143d6ea3b7e1f03e93a85a27be84ff20ec8d739d7bc9bed2dd391ec7503aa3c66834977d3df14950574821ccc5c7b35697020c6bb34fa9e5666b5cf449cf"

RPROVIDES:${PN} += "osmo-bsc-meas-utils osmo-bsc-meas-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmo-mgcp-client.so.9()(64bit) libosmo-sigtran.so.7()(64bit) libosmoabis.so.10()(64bit) libosmocore.so.20()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmonetif.so.11()(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
