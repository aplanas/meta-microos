SUMMARY = "VDPAU trace library"
DESCRIPTION = "This package provides the library for tracing VDPAU function calls. \
Its usage is documented in the README."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "libvdpau_trace1-1.5-1.6.aarch64.rpm"
RPM_HASH = "151151a9a672fde74675352e5fc5771843ef6e8078df5d59bacb17cab80ecc442e812432a8609f6801696f2a6861f29317aff46118a5351572f4005006dc79bc"

RPROVIDES:${PN} += "libvdpau_trace \
libvdpau_trace.so.1()(64bit) \
libvdpau_trace1 \
libvdpau_trace1(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libvdpau1"

inherit rpm
