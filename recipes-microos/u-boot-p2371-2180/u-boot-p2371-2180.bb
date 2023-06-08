SUMMARY = "The U-Boot firmware for the p2371-2180 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the p2371-2180 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-p2371-2180-2023.04-2.1.aarch64.rpm"
RPM_HASH = "f244ad46a20233c5165676455c59d650a9218561658382115314c4b6a11866667d2896710e225fcda34d303ca6a3ec0c5b890629ecbe0951d8388c593d05f5dc"

RPROVIDES:${PN} += "u-boot-loader u-boot-p2371-2180 u-boot-p2371-2180(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
