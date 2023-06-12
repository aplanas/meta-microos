SUMMARY = "Storage driver plugin including all backends for the libvirtd daemon"
DESCRIPTION = "The storage driver plugin for the libvirtd daemon, providing \
an implementation of the storage APIs using LVM, iSCSI, \
parted and more."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-driver-storage-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "4e7d7318966cf39899c08e1bd01b00a6485d956c9b2e3acb91cf702f63529473e053f41d87db024b8a975ec97b0c7ebe876bc1ed3aae26ea6ba1e80459c7e36f"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage \
libvirt-daemon-driver-storage(aarch-64)"
RDEPENDS:${PN} += "libvirt-daemon-driver-storage-core \
libvirt-daemon-driver-storage-disk \
libvirt-daemon-driver-storage-iscsi \
libvirt-daemon-driver-storage-iscsi-direct \
libvirt-daemon-driver-storage-logical \
libvirt-daemon-driver-storage-mpath \
libvirt-daemon-driver-storage-rbd \
libvirt-daemon-driver-storage-scsi"

inherit rpm
