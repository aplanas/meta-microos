SUMMARY = "Command line utilities for Siemens BS-11 BTS"
DESCRIPTION = "There is a tool in this package for configuring the Siemens BS-11 BTS. \
Additionally, it contains one tool for making use of an ISDN-card and the \
public telephone network as frequency standard for the E1 line."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-bs11-utils-1.8.0-1.10.aarch64.rpm"
RPM_HASH = "4d0c982d69c9e6a3af6ec06b0c027a995b0dd710a6101fb2f1ae499b9da743d5dcd651edd284d8ebf7b094b0982d81133248bf9e15e0d4e02acaa7555e6e7605"

RPROVIDES:${PN} += "osmo-bsc-bs11-utils osmo-bsc-bs11-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmo-mgcp-client.so.9()(64bit) libosmo-sigtran.so.7()(64bit) libosmoabis.so.10()(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmonetif.so.8()(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
