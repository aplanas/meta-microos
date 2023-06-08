SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rpiarm64-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "2a73f35248648bf1ae94168ebe7ad00ea06f1d96fe8dab82095ff6bc862c47c67c4283a26d7c88ef2f6fb99b99e018e832386afbbddd173506a490343651e472"

RPROVIDES:${PN} += "u-boot-rpiarm64-doc u-boot-rpiarm64-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
