SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pinebook-pro-rk3399-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "eb67c453bd618fe5351961b61bf7a718f0f70dcb24096b48ed3aa9c1fb98b274b046f661c935b851803fb73f73c76851551845a34d0d93e900f40620edd8fc23"

RPROVIDES:${PN} += "u-boot-pinebook-pro-rk3399-doc u-boot-pinebook-pro-rk3399-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
