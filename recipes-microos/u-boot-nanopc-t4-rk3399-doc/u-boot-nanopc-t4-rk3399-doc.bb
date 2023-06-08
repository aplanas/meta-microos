SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-nanopc-t4-rk3399-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "2d08308ded55f2f7cb6ceb349a8b858881a11fb239d98fa4a01951efbba0eaed501e62e9a2a182743586f8bb80a90a47e3789f3d8256a1b6d2f0cb963ecda7ca"

RPROVIDES:${PN} += "u-boot-nanopc-t4-rk3399-doc u-boot-nanopc-t4-rk3399-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
