SUMMARY = "Shared library package of libvterm"
DESCRIPTION = "An abstract C99 library which implements a VT220 or xterm-like \
terminal emulator. It does not use any particular graphics toolkit or \
output system. Instead, it invokes callback function pointers that \
its embedding program should provide it to draw on its behalf."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libvterm0-0.3.2-1.1.aarch64.rpm"
RPM_HASH = "ec350d979d482d709141dcb35043f999d02282cdf5c7a0a8e19536e52d34e3bbee69922138e89b574e6f903f88a577907ce6aec4f4c0d74be8cc8957b248b49c"

RPROVIDES:${PN} += "libvterm.so.0()(64bit) \
libvterm0 \
libvterm0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
