SUMMARY = "Storage driver plugin for lvm volumes"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for block \
volumes using lvm."
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-daemon-driver-storage-logical-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "f447a16a9a265e7eb6b78357ca508d7e8cf7e5b0f68fed5993c08c5a0fbea6648840b706df0c84c11ac86ef051ba2e41dcec891b873240face14739fd7f1dc1d"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-logical libvirt-daemon-driver-storage-logical(aarch-64) libvirt_storage_backend_logical.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libvirt-daemon-driver-storage-core libvirt-libs libvirt.so.0()(64bit) libvirt.so.0(LIBVIRT_PRIVATE_9.3.0)(64bit) lvm2"

inherit rpm
