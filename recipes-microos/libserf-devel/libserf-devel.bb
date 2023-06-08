SUMMARY = "High-Performance Asynchronous HTTP Client Library"
DESCRIPTION = "The serf library is a C-based HTTP client library built upon the Apache \
Portable Runtime (APR) library. It multiplexes connections, running the \
read/write communication asynchronously. Memory copies and transformations are \
kept to a minimum to provide high performance operation."
LICENSE = "Apache-2.0"

PV = "1.3.9"

RPM_NAME = "libserf-devel-1.3.9-7.1.aarch64.rpm"
RPM_HASH = "c12b3142935d6c3d958c8a51644ba5c845a451a0365866f0be9ce3a25d29b5e4298477ad53274822e74b0ce0fa66cf5fd74fcf0d27953a4f89cb334b7ba14901"

RPROVIDES:${PN} += "libserf-devel libserf-devel(aarch-64) pkgconfig(serf-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libserf-1-1 pkgconfig(libcrypto) pkgconfig(libssl)"

inherit rpm
