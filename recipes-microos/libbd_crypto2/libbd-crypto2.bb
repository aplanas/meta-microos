SUMMARY = "The crypto plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to LUKS-style encrypted devices."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_crypto2-2.28-1.4.aarch64.rpm"
RPM_HASH = "96fcb38c18054e89eb3acd3477ab3ed38d2cd3d5eb6f1bf9f84eb10b95f31914b69dfee3c9e9b67e993143d37f439424e4e60b474020aabb564d96ef63ed8643"

RPROVIDES:${PN} += "libbd_crypto.so.2()(64bit) libbd_crypto2 libbd_crypto2(aarch-64) libblockdev-crypto"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbd_utils.so.2()(64bit) libblkid.so.1()(64bit) libblkid.so.1(BLKID_2.15)(64bit) libblkid.so.1(BLKID_2.17)(64bit) libc.so.6(GLIBC_2.25)(64bit) libcryptsetup.so.12()(64bit) libcryptsetup.so.12(CRYPTSETUP_2.0)(64bit) libcryptsetup.so.12(CRYPTSETUP_2.4)(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
