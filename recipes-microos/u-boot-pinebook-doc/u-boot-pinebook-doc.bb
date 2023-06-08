SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pinebook-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "a7db5d24181d5688d3933c3d2045977a95ee8c40c3a50fb2e36341a15e77e5ed405607a4c46b0d237c9d75b5bfc0edb30b08ae942ab58c966f8c8450579af065"

RPROVIDES:${PN} += "u-boot-pinebook-doc u-boot-pinebook-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
