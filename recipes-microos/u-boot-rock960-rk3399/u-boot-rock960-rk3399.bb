SUMMARY = "The U-Boot firmware for the rock960-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock960-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rock960-rk3399-2023.04-2.1.aarch64.rpm"
RPM_HASH = "b7b0ddbec395e5450110d30bd35b27532a3c823ff0ea41efc3f176ea37fbcc19bd88489d94f28327854959e39b714e721e6b88c104be1159a628a11a9699fe9e"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rock960-rk3399 \
u-boot-rock960-rk3399(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
