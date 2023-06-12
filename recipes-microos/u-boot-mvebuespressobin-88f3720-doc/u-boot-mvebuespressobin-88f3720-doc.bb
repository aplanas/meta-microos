SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-mvebuespressobin-88f3720-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "d6cf677bc994e35fceed046f184ae47e9bb2c7776bc57b8627cccfcd1f0d1c131bd8bb2723fe9198cc4a65c7a1c5cd8ac08c8cf93eaf3d5288142b825e284d72"

RPROVIDES:${PN} += "u-boot-mvebuespressobin-88f3720-doc \
u-boot-mvebuespressobin-88f3720-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
