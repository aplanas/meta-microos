SUMMARY = "The U-Boot firmware for the mvebuespressobin-88f3720 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the mvebuespressobin-88f3720 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-mvebuespressobin-88f3720-2023.04-2.1.aarch64.rpm"
RPM_HASH = "1d7946509044ef89aadb616f1c4aae8af93734d7deb62aef4bdbde8c27110fc78cdb6a3caca3619e60f8417bf2f5c0be08d5da9648aea4ff23ad86509e9c7108"

RPROVIDES:${PN} += "u-boot-loader u-boot-mvebuespressobin-88f3720 u-boot-mvebuespressobin-88f3720(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
