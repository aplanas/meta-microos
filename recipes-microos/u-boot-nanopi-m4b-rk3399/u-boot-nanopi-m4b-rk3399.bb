SUMMARY = "The U-Boot firmware for the nanopi-m4b-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the nanopi-m4b-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-nanopi-m4b-rk3399-2023.04-2.1.aarch64.rpm"
RPM_HASH = "ec06eeb35faf52e013d69508d5cc30566c2870a0b5f08a1e95a90c5d88751fdb10e27f557caa210a18d67234fb34012f8ee1a41cd18a1a4a566045dc7a076d91"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-nanopi-m4b-rk3399 \
u-boot-nanopi-m4b-rk3399(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
