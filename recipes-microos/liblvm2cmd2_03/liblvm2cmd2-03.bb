SUMMARY = "LVM2 command line library"
DESCRIPTION = "The lvm2 command line library allows building programs that manage \
lvm devices without invoking a separate program."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "liblvm2cmd2_03-2.03.16-6.3.aarch64.rpm"
RPM_HASH = "b2973a8a4253fbd83337d7219c769edf08343bc53a980b2c61023b44b40e0e5ab57fabce5d9db15b0a8d7d3713ac50014e7d1439ed0c965b49f8c6ea30b64724"

RPROVIDES:${PN} += "liblvm2cmd.so.2.03()(64bit) \
liblvm2cmd.so.2.03(Base)(64bit) \
liblvm2cmd2_03 \
liblvm2cmd2_03(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaio.so.1()(64bit) \
libaio.so.1(LIBAIO_0.1)(64bit) \
libaio.so.1(LIBAIO_0.4)(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_1.0)(64bit) \
libblkid.so.1(BLKID_2.15)(64bit) \
libblkid.so.1(BLKID_2.17)(64bit) \
libblkid.so.1(BLKID_2.23)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libdevmapper-event.so.1.03()(64bit) \
libdevmapper-event.so.1.03(Base)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libsystemd.so.0(LIBSYSTEMD_233)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
