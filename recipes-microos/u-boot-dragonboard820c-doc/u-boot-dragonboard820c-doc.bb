SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-dragonboard820c-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "5d64504404596e1ac264ec00b577bead785ce8111dec2366e82c2e0c281668e4dcda40abc65f67a7b24ffd9901cce361edde408266daf702a80590acebd0a870"

RPROVIDES:${PN} += "u-boot-dragonboard820c-doc \
u-boot-dragonboard820c-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
