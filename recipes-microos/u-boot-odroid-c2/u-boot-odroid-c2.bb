SUMMARY = "The U-Boot firmware for the odroid-c2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the odroid-c2 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-odroid-c2-2023.04-2.1.aarch64.rpm"
RPM_HASH = "79aad7953496b25c3234032b546062792e4eec8a22874a81cd93b0b81550e29036078363620dc3df5206b232616612bd46a671a7b5dd850db00c04289866c2ee"

RPROVIDES:${PN} += "u-boot-loader u-boot-odroid-c2 u-boot-odroid-c2(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
