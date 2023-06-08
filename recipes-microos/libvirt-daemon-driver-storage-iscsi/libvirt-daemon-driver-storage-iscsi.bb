SUMMARY = "Storage driver plugin for iscsi"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for iscsi \
volumes using the host iscsi stack."
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-daemon-driver-storage-iscsi-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "db0d1da56fecacf8a50b9bdf97c6978a69b2acaaf89c5d09a1298b8b525466cb59929b8038ec1ad5e964c15548dabb58f42b1aef4a5c4a252066be59a8b9e117"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-iscsi libvirt-daemon-driver-storage-iscsi(aarch-64) libvirt_storage_backend_iscsi.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libvirt-daemon-driver-storage-core libvirt-libs libvirt.so.0()(64bit) libvirt.so.0(LIBVIRT_PRIVATE_9.3.0)(64bit) open-iscsi"

inherit rpm
