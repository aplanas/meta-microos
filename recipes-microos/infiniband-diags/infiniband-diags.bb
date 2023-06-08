SUMMARY = "InfiniBand Diagnostic Tools"
DESCRIPTION = "diags provides IB diagnostic programs and scripts needed to diagnose an \
IB subnet."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "infiniband-diags-42.0-2.3.aarch64.rpm"
RPM_HASH = "3a5e4734f39d35ebb6b530df05711d8dbc6f29c99854e20b146457e7e3cb6e8eb2ed0f0b13dc0a006d208a8b46dcef45abbab668dd01459946731e070f35fb94"

RPROVIDES:${PN} += "config(infiniband-diags) infiniband-diags infiniband-diags(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libibmad.so.5()(64bit) libibmad.so.5(IBMAD_1.3)(64bit) libibnetdisc.so.5()(64bit) libibnetdisc.so.5(IBNETDISC_1.0)(64bit) libibumad.so.3()(64bit) libibumad.so.3(IBUMAD_1.0)(64bit) libibumad.so.3(IBUMAD_1.1)(64bit) libibumad.so.3(IBUMAD_1.2)(64bit) perl"

inherit rpm
