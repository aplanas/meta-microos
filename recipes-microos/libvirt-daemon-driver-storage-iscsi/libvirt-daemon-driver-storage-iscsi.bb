SUMMARY = "Storage driver plugin for iscsi"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for iscsi \
volumes using the host iscsi stack."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-storage-iscsi-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "053563968fa6cd03692b04e443b091b9620e18a7baa35b5ab0e86f6050138eac2b95d7e14ab2130154d1c3c622a2d47fff7922d851284116ca9cf9ee5aa2e401"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-iscsi libvirt-daemon-driver-storage-iscsi(aarch-64) libvirt_storage_backend_iscsi.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libvirt-daemon-driver-storage-core libvirt-libs libvirt.so.0()(64bit) libvirt.so.0(LIBVIRT_PRIVATE_9.4.0)(64bit) open-iscsi"

inherit rpm
