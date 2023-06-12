SUMMARY = "Development headers for the Cap'n Proto C++ Library"
DESCRIPTION = "Cap'n Proto is a binary data interchange format and capability-based \
RPC system. \
 \
This package provides development headers for capnproto."
LICENSE = "MIT"

PV = "0.10.4"

RPM_NAME = "libcapnp-devel-0.10.4-1.1.aarch64.rpm"
RPM_HASH = "dad26ac04cf3f06948f6b90b9cd957f9220ba9506972d412b87b98f99ca480f30a8d603e5720f3fd6ebb7163290cf845786ffa24433cf2dc9005c95e3895148c"

RPROVIDES:${PN} += "cmake(CapnProto) \
libcapnp-devel \
libcapnp-devel(aarch-64) \
pkgconfig(capnp) \
pkgconfig(capnp-json) \
pkgconfig(capnp-rpc) \
pkgconfig(capnp-websocket) \
pkgconfig(capnpc) \
pkgconfig(kj) \
pkgconfig(kj-async) \
pkgconfig(kj-gzip) \
pkgconfig(kj-http) \
pkgconfig(kj-test) \
pkgconfig(kj-tls)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcapnp-0_10_4"

inherit rpm
