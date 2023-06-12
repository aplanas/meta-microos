SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-libretech-cc-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "9950a7be200aa8f570b0bd245b54a9c7234c58e54be5fb762716735501db1e359d05e2eafb7800f43191599d42544e5220f9bae1a3637c87a34b68510119e8fc"

RPROVIDES:${PN} += "u-boot-libretech-cc-doc \
u-boot-libretech-cc-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
