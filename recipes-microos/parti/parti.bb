SUMMARY = "Show partition table information"
DESCRIPTION = "Show partition table information for \
* Master Boot Record (MBR) Partition Table \
* GUID Partition Table (GPT) \
* Apple Partition Map \
* El Torito Bootable CD/DVD \
* zIPL boot info \
 \
It shows the complete information but mostly in uninterpreted form (unlike partitioning tools like fdisk or parted). \
 \
So it can be used to verify the data your favorite partitioning tool has actually written."
LICENSE = "GPL-3.0"

PV = "2.3"

RPM_NAME = "parti-2.3-1.1.aarch64.rpm"
RPM_HASH = "853fe226344c2e524367db2b6130cb10f9901c5cf44d7f1d862b2e4fbc24d9a2c19a2a5ca0dfcb162ad9145fa74efe99eead360a78330efeff75f327941467c7"

RPROVIDES:${PN} += "parti parti(aarch-64)"
RDEPENDS:${PN} += "libblkid.so.1()(64bit) libblkid.so.1(BLKID_2.15)(64bit) libc.so.6(GLIBC_2.34)(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) mkisofs"

inherit rpm
