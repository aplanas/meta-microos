SUMMARY = "The U-Boot firmware for the p2771-0000-500 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the p2771-0000-500 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-p2771-0000-500-2023.04-2.1.aarch64.rpm"
RPM_HASH = "74a912f48f42b9f939b73f8e56311f31adbc961233c9f815c126d6b869de833b94d0fb106e08e85b16409aedc5d106fd5b0660456b79ccafb294edc178f6cc55"

RPROVIDES:${PN} += "u-boot-loader u-boot-p2771-0000-500 u-boot-p2771-0000-500(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
