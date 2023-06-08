SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-p2371-2180-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "742ae8ec365a5c216fb71205383742ca1b2a38f0f7a69cc0d751100e839da5aebc65ccdb0dd1c9c86a47f7521ab825939d8cb7f53c27057cb4f659ae77637f89"

RPROVIDES:${PN} += "u-boot-p2371-2180-doc u-boot-p2371-2180-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
