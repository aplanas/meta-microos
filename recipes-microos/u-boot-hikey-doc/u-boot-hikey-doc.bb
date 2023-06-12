SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-hikey-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "ea84b0dcac71911c47cb375344bc8820b71be7ad75fe26e57b54ecc4cfc99bed1f773b162c02c2a931c927800ec4140829065b921a19d4c34d229bb5803189bf"

RPROVIDES:${PN} += "u-boot-hikey-doc \
u-boot-hikey-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
