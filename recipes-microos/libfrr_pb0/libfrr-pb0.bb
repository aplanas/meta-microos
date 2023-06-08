SUMMARY = "FRRouting protobuf library"
DESCRIPTION = "This library contains protobuf memory management for FRRouting.."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrr_pb0-8.4-3.1.aarch64.rpm"
RPM_HASH = "6e353f829eeeeea40823b42d48bbad6a7df771a296d1608b11879e69f9e975f3b98b871626e979c4ab236a6fca8e1df6f2e7a59053107225e88ad0efa66fd01a"

RPROVIDES:${PN} += "libfrr_pb.so.0()(64bit) libfrr_pb0 libfrr_pb0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libprotobuf-c.so.1()(64bit) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit)"

inherit rpm
