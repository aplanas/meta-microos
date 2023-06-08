SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pineh64-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "8d0389c78df01ff4fb6dc355d218100687b31ef4a6b93acfc17457c4cb413989efc943185943f0feef08f741137b19d84e2e5083d3bc840663ab6bef54676258"

RPROVIDES:${PN} += "u-boot-pineh64-doc u-boot-pineh64-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
