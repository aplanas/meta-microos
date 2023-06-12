SUMMARY = "Osmocom Signalling Connection Control Part library"
DESCRIPTION = "The Signalling Connection Control Part (SCCP) is a network layer \
protocol that provides extended routing, flow control, segmentation, \
connection-orientation, and error correction facilities in Signaling \
System 7 telecommunications networks. SCCP relies on the services of \
MTP for basic routing and error detection."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-sccp-1_7_0-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "42e82e7f757290c10047e26e3ae02bf463f50c64d1b93e1ec1c4a0ab88da7609093323429a79b039b68b8d2c59dbbad9da759cb6d8b1a1f2ee08ef7532180fa7"

RPROVIDES:${PN} += "libosmo-sccp-1.7.0.so()(64bit) libosmo-sccp-1_7_0 libosmo-sccp-1_7_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.20()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
