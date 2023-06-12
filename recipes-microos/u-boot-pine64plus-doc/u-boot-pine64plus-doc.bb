SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pine64plus-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "3a8899d59bcfebf9187f36778c78f82eedf205255761975fba811526007a38489f893ac2d9303d91b1e67047d95a7724834432dd55fae67e54afb76935f5e64a"

RPROVIDES:${PN} += "u-boot-pine64plus-doc \
u-boot-pine64plus-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
