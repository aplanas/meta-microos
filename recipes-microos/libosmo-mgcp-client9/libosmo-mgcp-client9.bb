SUMMARY = "Osmocom's Media Gateway Control Protocol client library"
DESCRIPTION = "Osmocom's Media Gateway Control Protocol client library."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "libosmo-mgcp-client9-1.9.0-1.10.aarch64.rpm"
RPM_HASH = "869623a0916c713138f2262c58b21013df7be28744283767e82b58736aa224a35263a1f149519f8de678e1fb51199c94667e80ed14eb8134111e36b20aa91cec"

RPROVIDES:${PN} += "libosmo-mgcp-client.so.9()(64bit) libosmo-mgcp-client9 libosmo-mgcp-client9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.20()(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
