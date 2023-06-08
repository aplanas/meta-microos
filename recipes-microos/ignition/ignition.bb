SUMMARY = "First boot installer and configuration tool"
DESCRIPTION = "Ignition is an utility to manipulate disks and configuration files \
during the initramfs. This includes partitioning disks, formatting \
partitions, writing files (regular files, systemd units, etc.), and \
creating users. \
On first boot, Ignition reads its configuration from a source of truth \
(remote URL, network metadata service, hypervisor bridge, etc.) and \
applies the configuration."
LICENSE = "Apache-2.0"

PV = "2.15.0"

RPM_NAME = "ignition-2.15.0-2.3.aarch64.rpm"
RPM_HASH = "20674c301afc0c250c219f1f2797f2d69b742674ab3a9bd71354b445b38e231382e805aa6959f532d9155a06460143632cafe7c5d6a3af4362e5797caf9a2fb0"

RPROVIDES:${PN} += "ignition ignition(aarch-64) ignition-dracut"
RDEPENDS:${PN} += "/bin/bash /bin/sh dracut ignition-dracut-grub2 libblkid.so.1()(64bit) libblkid.so.1(BLKID_1.0)(64bit) libblkid.so.1(BLKID_2.15)(64bit) libblkid.so.1(BLKID_2.17)(64bit) libblkid.so.1(BLKID_2.18)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
