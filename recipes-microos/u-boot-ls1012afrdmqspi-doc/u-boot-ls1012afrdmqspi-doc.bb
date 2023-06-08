SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-ls1012afrdmqspi-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "dccbf72d9a88909c83838d215b0e565af8dbca67a1eae4f170aa8f4356ad6e2947b3558f21dbbb93f4909d0e6c823e33f4be499a405a969cea22acece2f4c2fe"

RPROVIDES:${PN} += "u-boot-ls1012afrdmqspi-doc u-boot-ls1012afrdmqspi-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
