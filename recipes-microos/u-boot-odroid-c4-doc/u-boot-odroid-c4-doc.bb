SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-odroid-c4-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "5ebc0a5f998ec0856c7b681031412cf68958137ba13f4365e3be8aca60a115cbb2cf30686582e261dc7fd06f6089628a595e81529074b7573bdb068cc45df153"

RPROVIDES:${PN} += "u-boot-odroid-c4-doc \
u-boot-odroid-c4-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
