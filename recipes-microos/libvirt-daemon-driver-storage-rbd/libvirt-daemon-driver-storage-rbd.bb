SUMMARY = "Storage driver plugin for rbd"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for rbd \
volumes using the ceph protocol."
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-daemon-driver-storage-rbd-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "9217de7a35fab53b4817b0e7b77aff3d2839f3e8b7aa6dd9519d1ce79722937764a2945a72af5d3c645a8744c8d6656bafdbc03522cfbe17da13bb8362b44182"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-rbd libvirt-daemon-driver-storage-rbd(aarch-64) libvirt_storage_backend_rbd.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) librados.so.2()(64bit) librados.so.2(LIBRADOS_14.2.0)(64bit) librbd.so.1()(64bit) libvirt-daemon-driver-storage-core libvirt-libs libvirt.so.0()(64bit) libvirt.so.0(LIBVIRT_PRIVATE_9.3.0)(64bit)"

inherit rpm
