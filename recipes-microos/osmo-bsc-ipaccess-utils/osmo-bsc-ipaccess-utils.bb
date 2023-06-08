SUMMARY = "Command line utilities for ip.access nanoBTS"
DESCRIPTION = "This package contains utilities that are specific for nanoBTS when being \
used together with OpenBSC. It contains mainly two tools: ipaccess-config \
and ipaccess-proxy."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-ipaccess-utils-1.8.0-1.10.aarch64.rpm"
RPM_HASH = "d4f34d3dfb0c4a8b38054411323f39baee54391ef4e2c42283c824b14b8b0caba9790867c45713fd4da4d47ce67568c572be5cd010fbb776f3a2e786b0c8d08d"

RPROVIDES:${PN} += "osmo-bsc-ipaccess-utils osmo-bsc-ipaccess-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmo-mgcp-client.so.9()(64bit) libosmo-sigtran.so.7()(64bit) libosmoabis.so.10()(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmonetif.so.8()(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
