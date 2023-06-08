SUMMARY = "Osmocom Signalling Connection Control Part library"
DESCRIPTION = "The Signalling Connection Control Part (SCCP) is a network layer \
protocol that provides extended routing, flow control, segmentation, \
connection-orientation, and error correction facilities in Signaling \
System 7 telecommunications networks. SCCP relies on the services of \
MTP for basic routing and error detection."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "libosmo-sccp-1_6_0-1.6.0-1.4.aarch64.rpm"
RPM_HASH = "dbf4fb16bc1d97b86e2e0233afea60f2bcae2067147d66fe3b645374b9e2238474e0ee794b0c7cf4f958b84fbb8f5c4becce317d52d6a351801929930f46c0a5"

RPROVIDES:${PN} += "libosmo-sccp-1.6.0.so()(64bit) libosmo-sccp-1_6_0 libosmo-sccp-1_6_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
