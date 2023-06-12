SUMMARY = "KIWI - host requirements for filesystems"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build filesystem images"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-filesystems-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "387622ca8f46c2d87db9277c955776ae1baa29f812df05e9e9f8f45aab26792c48e35feb45298fab85e8f0e320e01cf653953686997347952755f6f5f5d8fcd1"

RPROVIDES:${PN} += "kiwi-filesystem-requires \
kiwi-filesystem:btrfs \
kiwi-filesystem:ext2 \
kiwi-filesystem:ext3 \
kiwi-filesystem:ext4 \
kiwi-filesystem:squashfs \
kiwi-filesystem:xfs \
kiwi-image-pxe-requires \
kiwi-image:kis \
kiwi-image:pxe \
kiwi-systemdeps-filesystems \
kiwi-systemdeps-filesystems(aarch-64)"
RDEPENDS:${PN} += "btrfsprogs \
dosfstools \
e2fsprogs \
kiwi-systemdeps-core \
qemu-tools \
squashfs \
xfsprogs"

inherit rpm
