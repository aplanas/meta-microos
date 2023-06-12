SUMMARY = "SMPP-3.4 protocol library"
DESCRIPTION = "This library provides the Protocol Data Unit (PDU) handling of the \
SMPP-3.4 protocol. SMPP (Short Message Peer-to-Peer) is a protocol \
providing a data communication interface for the transfer of short \
message data between External Short Messaging Entities, Routing \
Entitites and Message Centres."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "libsmpp34-1-1.14.1-1.9.aarch64.rpm"
RPM_HASH = "b5baff125847ea831da277affb120d2a454c4c8dcda3d10b732bc6a6d0f00fc681bf5e2ae969da29928ec36790dbf34ba88fccdcc5a090b6e49761f3f3db6ac9"

RPROVIDES:${PN} += "libsmpp34-1 \
libsmpp34-1(aarch-64) \
libsmpp34.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
