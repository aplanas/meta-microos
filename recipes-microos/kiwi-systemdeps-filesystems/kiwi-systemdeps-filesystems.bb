SUMMARY = "KIWI - host requirements for filesystems"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build filesystem images"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.57"

RPM_NAME = "kiwi-systemdeps-filesystems-9.24.57-1.2.aarch64.rpm"
RPM_HASH = "af74f5d2b6261757474be21d378d94368244594484a082bd4833ce920e510da622c7d3bd4dcc53b169207c796aabdd603be0bab5e7505224f36b58dd73fbed8a"

RPROVIDES:${PN} += "kiwi-filesystem-requires kiwi-filesystem:btrfs kiwi-filesystem:ext2 kiwi-filesystem:ext3 kiwi-filesystem:ext4 kiwi-filesystem:squashfs kiwi-filesystem:xfs kiwi-image-pxe-requires kiwi-image:kis kiwi-image:pxe kiwi-systemdeps-filesystems kiwi-systemdeps-filesystems(aarch-64)"
RDEPENDS:${PN} += "btrfsprogs dosfstools e2fsprogs kiwi-systemdeps-core qemu-tools squashfs xfsprogs"

inherit rpm
