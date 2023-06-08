SUMMARY = "The U-Boot firmware for the geekbox platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the geekbox platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-geekbox-2023.04-2.1.aarch64.rpm"
RPM_HASH = "1b6dc74653ac3b8b8da274ee923bb11cca72edeae6e3b24c7ad4a9bbf1aea453ab4df06d2936190ba62f1e310dff8a47ca8df86640f0cd92c45826c2eda5f671"

RPROVIDES:${PN} += "u-boot-geekbox u-boot-geekbox(aarch-64) u-boot-loader"
RDEPENDS:${PN} += ""

inherit rpm
