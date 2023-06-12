SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rock960-rk3399-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "58461144707c9263efb2beecd4fa0180a27f2e49df1c951c4be3e5aa6551effa6555b1b66e1795c0986e18dff06e4ad0767b448de7f14ecd9ad5aa74e9d87419"

RPROVIDES:${PN} += "u-boot-rock960-rk3399-doc \
u-boot-rock960-rk3399-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
