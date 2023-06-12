SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-avnetultra96rev1-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "487ab5998c1572234dcf503e2af7b39f992e30185c3682c1f7af4f4993d81e98a87f3db84f65171a41910212d05314ac3b3f798f1c03a5b5548395d554f3a4f5"

RPROVIDES:${PN} += "u-boot-avnetultra96rev1-doc \
u-boot-avnetultra96rev1-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
