SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-bananapim64-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "3808d7525414bd68f8f965ce7dc2e682a94e5657d01fce1ecab7ee7247dfb30b40de9c96066b2d0e5b8af2614f2b8247462c240b5bb2566bb5e0d3ebc339f05f"

RPROVIDES:${PN} += "u-boot-bananapim64-doc u-boot-bananapim64-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
