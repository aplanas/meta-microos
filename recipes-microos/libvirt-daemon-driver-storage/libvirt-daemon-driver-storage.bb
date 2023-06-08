SUMMARY = "Storage driver plugin including all backends for the libvirtd daemon"
DESCRIPTION = "The storage driver plugin for the libvirtd daemon, providing \
an implementation of the storage APIs using LVM, iSCSI, \
parted and more."
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-daemon-driver-storage-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "7305eb3f49652f6c970d429c6db1e8fa02c050811d725211b92fcdd82b82612c7dcc22488a26b4f2052e5cfa5c409caca408939129348d1af3842a87c19c1f17"

RPROVIDES:${PN} += "libvirt-daemon-driver-storage libvirt-daemon-driver-storage(aarch-64)"
RDEPENDS:${PN} += "libvirt-daemon-driver-storage-core libvirt-daemon-driver-storage-disk libvirt-daemon-driver-storage-iscsi libvirt-daemon-driver-storage-iscsi-direct libvirt-daemon-driver-storage-logical libvirt-daemon-driver-storage-mpath libvirt-daemon-driver-storage-rbd libvirt-daemon-driver-storage-scsi"

inherit rpm
