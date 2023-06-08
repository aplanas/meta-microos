SUMMARY = "Development headers for libmsgpack C library"
DESCRIPTION = "MessagePack is a binary-based object serialization library. It enables to \
exchange structured objects between many languages like JSON. \
 \
This package provides headers and other devel files."
LICENSE = "BSL-1.0"

PV = "4.0.0"

RPM_NAME = "msgpack-c-devel-4.0.0-1.3.aarch64.rpm"
RPM_HASH = "36ed982eb8727092c2c863eb7503619f7725d0d2b6578dcfd0357e88f57d8d31b9334fe7029393125a641315733dc7e53bb84aae7185ff728172997c8d8b11be"

RPROVIDES:${PN} += "cmake(msgpack) libmsgpack-devel libmsgpackc-devel msgpack-c-devel msgpack-c-devel(aarch-64) pkgconfig(msgpack)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmsgpackc2"

inherit rpm
