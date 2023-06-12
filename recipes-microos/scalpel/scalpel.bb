SUMMARY = "Fast, filesystem-independent file carver"
DESCRIPTION = "Scalpel is a fast file carver that reads a database of header and footer \
definitions and extracts matching files or data fragments from a set of \
image files or raw device files. Scalpel is filesystem-independent and will \
carve files from FATx, NTFS, ext2/3, HFS+, or raw partitions. \
It is useful for both digital forensics investigation and file recovery."
LICENSE = "GPL-2.0+"

PV = "2.0"

RPM_NAME = "scalpel-2.0-7.26.aarch64.rpm"
RPM_HASH = "de00bd2e919ec785734b6278f4b04d18f4cb5e34d1e67b4c94ee291cf75f7c3bef3b81ed225b11c828806786b55d8ccebb55065b9320259068fb954ee4fd4a64"

RPROVIDES:${PN} += "scalpel \
scalpel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libtre.so.5()(64bit)"

inherit rpm
