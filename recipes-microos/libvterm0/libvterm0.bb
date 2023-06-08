SUMMARY = "Shared library package of libvterm"
DESCRIPTION = "An abstract C99 library which implements a VT220 or xterm-like \
terminal emulator. It does not use any particular graphics toolkit or \
output system. Instead, it invokes callback function pointers that \
its embedding program should provide it to draw on its behalf."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "libvterm0-0.3.1-1.3.aarch64.rpm"
RPM_HASH = "0343335dfeef9d1904e7b24f98ffcb721c9d65174ec2ea4714441772c577487f5d25868a3d6c3a90f11e16b3feb7da8a6210303ba05e282b6733cedc6bc2ad91"

RPROVIDES:${PN} += "libvterm.so.0()(64bit) libvterm0 libvterm0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
