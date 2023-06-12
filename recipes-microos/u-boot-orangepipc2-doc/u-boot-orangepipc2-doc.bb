SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-orangepipc2-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "521a1b39a9857f65a79a172b5b00005467eafc044f3e942cba2664e352c28ef009e00cba1142d3c2e871eb7076dfdb3b5d0cfb47bd3791d13241cad5eb9d5529"

RPROVIDES:${PN} += "u-boot-orangepipc2-doc \
u-boot-orangepipc2-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
