SUMMARY = "The U-Boot firmware for the bananapim64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the bananapim64 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-bananapim64-2023.04-2.1.aarch64.rpm"
RPM_HASH = "b800acb2f09eaae6c54d2ea0b86a3a98dbef0f20bc040d8ffa4acf0d38c67599c30e97f1a2234443e37f5bedc617f4faa5674a2cda51070857c38351e64bcae3"

RPROVIDES:${PN} += "u-boot-bananapim64 u-boot-bananapim64(aarch-64) u-boot-loader"
RDEPENDS:${PN} += ""

inherit rpm
