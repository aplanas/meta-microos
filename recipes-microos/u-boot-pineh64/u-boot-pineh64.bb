SUMMARY = "The U-Boot firmware for the pineh64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pineh64 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pineh64-2023.04-2.1.aarch64.rpm"
RPM_HASH = "92b186a06dd3ac54d31aeee318fa8e8323a99a55336714c9d033372b06db0f457df12c383a582af90c7ec6954af144b2df75e101e19713daa5535fa97bc7c2a2"

RPROVIDES:${PN} += "u-boot-loader u-boot-pineh64 u-boot-pineh64(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
