SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-odroid-n2-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "e03d8e079a74467606e826ffb26ad246f63f076ae70c69c11967dd8e103b162ef085661a942f7d687a0490e4952ab2f257b1600023faab52db475e8810c21c0a"

RPROVIDES:${PN} += "u-boot-odroid-n2-doc \
u-boot-odroid-n2-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
