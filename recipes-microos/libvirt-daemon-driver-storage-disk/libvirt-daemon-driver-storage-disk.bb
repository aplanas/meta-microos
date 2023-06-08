SUMMARY = "Storage driver plugin for disk"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for block \
volumes using the host disks."
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-daemon-driver-storage-disk-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "5e4bc9c45087d2a7e0e9d43f4f6d202edac343295fe7570b2644b630d58563b5ea78ebaf86df90327ab0b62515e5dd5c426878098e7c05009ed42ed671877966"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-disk libvirt-daemon-driver-storage-disk(aarch-64) libvirt_storage_backend_disk.so()(64bit)"
RDEPENDS:${PN} += "device-mapper ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libvirt-daemon-driver-storage-core libvirt.so.0()(64bit) libvirt.so.0(LIBVIRT_PRIVATE_9.3.0)(64bit) parted"

inherit rpm
