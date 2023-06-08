SUMMARY = "Storage driver plugin for local scsi devices"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for scsi \
host devices."
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-daemon-driver-storage-scsi-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "e8c28e1068435baf3efc5e2e6dade2a021bbe6f6faa058429f6db86b06fc87cdc9fc159a5b343dc668541857f834277afa0d89426cfe7e9020d21deb50ae5815"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-scsi libvirt-daemon-driver-storage-scsi(aarch-64) libvirt_storage_backend_scsi.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libvirt-daemon-driver-storage-core libvirt-libs libvirt.so.0()(64bit) libvirt.so.0(LIBVIRT_0.1.0)(64bit) libvirt.so.0(LIBVIRT_PRIVATE_9.3.0)(64bit)"

inherit rpm
