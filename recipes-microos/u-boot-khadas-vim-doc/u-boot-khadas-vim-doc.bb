SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-khadas-vim-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "df34ffa7d17f4d7dc598a316f3bc789f7f16e04fce62e06c4eb84d105e9dfeaaddcffd3ece90af18f0f61a1b5e9c01db3e74dbf5e6294c3f0a90268aff31edf7"

RPROVIDES:${PN} += "u-boot-khadas-vim-doc \
u-boot-khadas-vim-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
