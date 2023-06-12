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

PV = "2.4"

RPM_NAME = "parti-2.4-1.1.aarch64.rpm"
RPM_HASH = "e552be187eebf0aee6e76e8aa0d889be49984f4c0f9f6885cfe7cc77ab72e323a5830eaefd9a6bed8049ed8f47b359237f23e1825d659dd01ecce4225c6fbb7b"

RPROVIDES:${PN} += "parti \
parti(aarch-64)"
RDEPENDS:${PN} += "libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_2.15)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
mkisofs"

inherit rpm
