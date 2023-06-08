SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-libretech-ac-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "f455a135758b3470e34aedb578341ba4d5a868d0a125bb6d4381b46324259eb280d56ddcaeec9a88cc66c0965ec40d1526aaf8448c16737c11820d3080529014"

RPROVIDES:${PN} += "u-boot-libretech-ac-doc u-boot-libretech-ac-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
