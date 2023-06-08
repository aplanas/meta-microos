SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-poplar-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "0525eeba036b99248023e1a58472a6dd2a4fb83699be63ae382a018136630d6416a42add78ab656118dfd64a01e314b639735b0426d74b1cd0afe5048223718b"

RPROVIDES:${PN} += "u-boot-poplar-doc u-boot-poplar-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
