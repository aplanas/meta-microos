SUMMARY = "The LVM plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides LVM-related functionality."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_lvm2-2.28-1.4.aarch64.rpm"
RPM_HASH = "75aea969c6e84d8730821e3edb0666e906a86e92c47e6822667e5f48a218abb1f7882e7eb611882493fe7b9748d0f61f479fee7cd8e132857dd3be6c4590f128"

RPROVIDES:${PN} += "libbd_lvm.so.2()(64bit) libbd_lvm2 libbd_lvm2(aarch-64) libblockdev-lvm"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbd_utils.so.2()(64bit) libbd_utils2 libc.so.6(GLIBC_2.17)(64bit) libdevmapper.so.1.03()(64bit) libdevmapper.so.1.03(Base)(64bit) libdevmapper.so.1.03(DM_1_02_97)(64bit) libglib-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) lvm2 thin-provisioning-tools"

inherit rpm
