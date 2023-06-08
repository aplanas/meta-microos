SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-p2771-0000-500-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "db7115ca09154629de999386015dabbd82274dbdd996c96f2fed11499993305adcf9fbd566bd067f6d49c68064f9550a8fd21fda2d2b4be879f1124c81635a4a"

RPROVIDES:${PN} += "u-boot-p2771-0000-500-doc u-boot-p2771-0000-500-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
