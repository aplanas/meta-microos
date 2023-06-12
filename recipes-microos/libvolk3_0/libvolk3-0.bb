SUMMARY = "VOLK shared library"
DESCRIPTION = "This package provides the VOLK shared library."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.0"

RPM_NAME = "libvolk3_0-3.0.0-1.3.aarch64.rpm"
RPM_HASH = "0a317e0dec3838f4b265d71b9c2322817fa42ea45e6f3ab18d6e79a70a3bb4449e822ce7c4b609659543b7018d29f7e9236ce9fbfaf632b1f7bf9e7b002192f4"

RPROVIDES:${PN} += "libvolk.so.3.0()(64bit) \
libvolk3_0 \
libvolk3_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
liborc-0.4.so.0()(64bit)"

inherit rpm
