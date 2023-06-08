SUMMARY = "Storage driver plugin for iscsi-direct"
DESCRIPTION = "The storage driver backend adding implementation of the storage APIs for iscsi \
volumes using libiscsi direct connection."
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-daemon-driver-storage-iscsi-direct-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "68fe134add4611eb7ae0a68f326a317c6f6d52214964c93f44e6d799fad729acd768e41c17c12c281eb921f8e6e9909426b28be9db87fab43c7434c993eeae1b"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage-iscsi-direct libvirt-daemon-driver-storage-iscsi-direct(aarch-64) libvirt_storage_backend_iscsi-direct.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libiscsi.so.9()(64bit) libvirt-daemon-driver-storage-core libvirt-libs libvirt.so.0()(64bit) libvirt.so.0(LIBVIRT_PRIVATE_9.3.0)(64bit)"

inherit rpm
