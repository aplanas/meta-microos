SUMMARY = "The Device Mapper plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to Device Mapper."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_dm2-2.28-1.4.aarch64.rpm"
RPM_HASH = "3d616c832b40c9630dba2911a338b80686dd4ec15614fc0d0b7185cb0fe7a55cc8285d37d3cba3e0b1b079b6c8a7763b49c23bc32168f8f8d2d4bbe064016211"

RPROVIDES:${PN} += "libbd_dm.so.2()(64bit) libbd_dm2 libbd_dm2(aarch-64) libblockdev-dm"
RDEPENDS:${PN} += "/sbin/ldconfig device-mapper dmraid ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbd_utils.so.2()(64bit) libbd_utils2 libc.so.6(GLIBC_2.17)(64bit) libdevmapper.so.1.03()(64bit) libdevmapper.so.1.03(Base)(64bit) libdevmapper.so.1.03(DM_1_02_97)(64bit) libdmraid.so.1()(64bit) libdmraid.so.1(Base)(64bit) libglib-2.0.so.0()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
