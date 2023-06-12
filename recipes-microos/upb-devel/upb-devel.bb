SUMMARY = "Developmnt files for upb"
DESCRIPTION = "μpb (often written 'upb') is a small protobuf implementation written in C. \
 \
upb generates a C API for creating, parsing, and serializing messages as \
declared in .proto files. upb is heavily arena-based: all messages always live \
in an arena (note: the arena can live in stack or static memory if desired). \
 \
This package provides development files for upb."
LICENSE = "Apache-2.0"

PV = "1.54.1"

RPM_NAME = "upb-devel-1.54.1-1.1.aarch64.rpm"
RPM_HASH = "bccdb346d2848b6e57c93915a589c7ffa64411c1e39463b7e476221993d633c4f0e7b8635df9deff7d1e913a13c3e09335044b21d4b424fc952ff66a93fc6a0d"

RPROVIDES:${PN} += "upb-devel \
upb-devel(aarch-64)"
RDEPENDS:${PN} += "libupb31"

inherit rpm
