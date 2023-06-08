SUMMARY = "A small protobuf implementation in C"
DESCRIPTION = "μpb (often written 'upb') is a small protobuf implementation written in C. \
 \
upb generates a C API for creating, parsing, and serializing messages as \
declared in .proto files. upb is heavily arena-based: all messages always live \
in an arena (note: the arena can live in stack or static memory if desired)."
LICENSE = "Apache-2.0"

PV = "1.54.1"

RPM_NAME = "libupb31-1.54.1-1.1.aarch64.rpm"
RPM_HASH = "5a88f6ca9766d57ad16bd57bb936d7ba9a0806fda053c37c287abb5c339c9176e9973638651a0fe443e9f54a1155da50456b1dcfa5b2d4350caeb0e2c17d7ffd"

RPROVIDES:${PN} += "libupb.so.31()(64bit) libupb31 libupb31(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
