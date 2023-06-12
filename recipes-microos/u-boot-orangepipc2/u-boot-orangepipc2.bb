SUMMARY = "The U-Boot firmware for the orangepipc2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the orangepipc2 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-orangepipc2-2023.04-2.1.aarch64.rpm"
RPM_HASH = "32023fb7356fc31b09997a65d795f8ad1a8f1094fc87ea29e5d956074737d0f6f3cc0c7d602fb99592f592f501137de79e9a871298bbafc2278d33c85e65830c"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-orangepipc2 \
u-boot-orangepipc2(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
