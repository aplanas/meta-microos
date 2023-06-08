SUMMARY = "Filesystem access for Apple devices"
DESCRIPTION = "iFuse is a FUSE filesystem driver which uses `libimobiledevice` to connect to \
devices without the need for a jailbreak. \
It is using the native Apple 'AFC' protocol, over the normal USB cable in order \
to access the iPhone's, iPod Touch's or iPad's media files under Linux."
LICENSE = "LGPL-2.0-or-later"

PV = "1.1.4"

RPM_NAME = "ifuse-1.1.4-1.10.aarch64.rpm"
RPM_HASH = "29edd2bfc68bc1dc0ae4ee573a6d15971883726d8d3d849e8ca804d5ff79f3d0735b2752dc3681596b13a50b918240d47a0b0e0d725827b28c81b23413c75018"

RPROVIDES:${PN} += "ifuse ifuse(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libfuse.so.2(FUSE_2.8)(64bit) libimobiledevice-1.0.so.6()(64bit) libplist-2.0.so.3()(64bit)"

inherit rpm
