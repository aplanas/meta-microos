SUMMARY = "A universal flash programming utility"
DESCRIPTION = "flashrom is a utility for reading, writing, verifying and erasing flash ROM \
chips. It's often used to flash BIOS/EFI/coreboot/firmware images in-system \
using a supported mainboard, but it also supports flashing of network \
cards (NICs), SATA controller cards, and other external devices which can \
program flash chips."
LICENSE = "GPL-2.0-only"

PV = "1.2"

RPM_NAME = "libflashrom1-1.2-4.5.aarch64.rpm"
RPM_HASH = "eca62fb1c661ebb2f821a15830eac00fd4c270f6ce8aa2c6e04edfa54a67af1ec23ad1914e178c325f086ba31b391188860b150226f7ac0f8fbdeb2481128621"

RPROVIDES:${PN} += "libflashrom.so.1()(64bit) libflashrom.so.1(LIBFLASHROM_1.0)(64bit) libflashrom1 libflashrom1(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libftdi1.so.2()(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
