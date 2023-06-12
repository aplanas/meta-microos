SUMMARY = "Low-level format tool for USB floppy drives under Linux"
DESCRIPTION = "ufiformat is a tool to low-level format USB floppy disks."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.9"

RPM_NAME = "ufiformat-0.9.9-12.12.aarch64.rpm"
RPM_HASH = "e53b2f77beee0198407732077ec386d7b47436dbb279bf29662bd695d86d9432420d57f209966c745836228ef3fba826662d006b6242f2175a76ac01fd41b980"

RPROVIDES:${PN} += "ufiformat \
ufiformat(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libext2fs.so.2()(64bit)"

inherit rpm
