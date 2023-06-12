SUMMARY = "User-mode networking for unprivileged network namespaces"
DESCRIPTION = "slirp for network namespaces, without copying buffers across the namespaces."
LICENSE = "GPL-2.0-only & MIT & BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "slirp4netns-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "f44755efac528e8d67b4ac5f2d83c32127372dad6f8fddde936e18746d43dd9cb500d61aae5538a8d2c2318a6a7899fb3375f5782fde0d424df0fdc2b3427be0"

RPROVIDES:${PN} += "slirp4netns \
slirp4netns(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libseccomp.so.2()(64bit) \
libslirp.so.0()(64bit) \
libslirp.so.0(SLIRP_4.0)(64bit) \
libslirp.so.0(SLIRP_4.1)(64bit)"

inherit rpm
