SUMMARY = "Development files for the Dynamic-to-Persistent allocation library"
DESCRIPTION = "The libvmmalloc library transparently converts all the dynamic memory \
allocations into persistent memory allocations. This allows the use \
of persistent memory as volatile memory without modifying the target \
application. \
 \
This subpackage contains libraries and header files for developing \
applications that want to specifically make use of libvmmalloc."
LICENSE = "BSD-3-Clause"

PV = "1.8"

RPM_NAME = "libvmmalloc-devel-1.8-2.9.aarch64.rpm"
RPM_HASH = "02073debaff9a44e6ff190a34b9d3a35fbd1daab4d5fe57c4cf367ef7426c859d1a14f7a27e659d997a6b5415a8ddf7c3477c7d8a11eb786c2c9eb4269cfc629"

RPROVIDES:${PN} += "libvmmalloc-devel \
libvmmalloc-devel(aarch-64) \
libvmmalloc.so.1()(64bit) \
pkgconfig(libvmmalloc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libvmmalloc1"

inherit rpm
