SUMMARY = "Development files for the Transport Independent RPC Library"
DESCRIPTION = "The Transport Independent RPC library (TI-RPC) is a replacement for the \
standard SunRPC library in glibc which does not support IPv6 addresses. \
This implementation allows the support of other transports than UDP and \
TCP over IPv4."
LICENSE = "BSD-3-Clause"

PV = "1.3.3"

RPM_NAME = "libtirpc-devel-1.3.3-1.6.aarch64.rpm"
RPM_HASH = "856162fc6bfce280780a8573c8050cfccf3fde4da91e59d1da68d128ee51972368471c50c3418f01f598c58d249de1f70571c2ad1c1cafb71772cd9bf648a7df"

RPROVIDES:${PN} += "libtirpc-devel \
libtirpc-devel(aarch-64) \
pkgconfig(libtirpc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libtirpc3"

inherit rpm
