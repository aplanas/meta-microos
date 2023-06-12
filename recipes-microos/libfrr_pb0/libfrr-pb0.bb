SUMMARY = "FRRouting protobuf library"
DESCRIPTION = "This library contains protobuf memory management for FRRouting.."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrr_pb0-8.4-4.1.aarch64.rpm"
RPM_HASH = "e733268758554e4c5465e3a414fe81e877e3949e8c3e132b783711494087aad540788b9aec8600bf519906319e16b1eb77c48c027702fe99f7e9cbfa994fffae"

RPROVIDES:${PN} += "libfrr_pb.so.0()(64bit) \
libfrr_pb0 \
libfrr_pb0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libprotobuf-c.so.1()(64bit) \
libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit)"

inherit rpm
