SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-p3450-0000-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "4fa43a0ba6d80231cde95a6b32393b8326ba0eb2cd6b53a564a692ad88531de048f56933d7b6a4df9cb98b1c0e5cba5716bad081b5775fde7265a3d22ff624ed"

RPROVIDES:${PN} += "u-boot-p3450-0000-doc u-boot-p3450-0000-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
