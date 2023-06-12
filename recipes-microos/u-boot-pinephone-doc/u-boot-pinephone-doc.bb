SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pinephone-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "473e3551cacffc76d5ff638e1510c2202f1bab4aa11f5a1c214d3e8aafe9b492721be0800e1c6c3745254d0a4246aa785b392ee2689956723eaa6d8460cb3991"

RPROVIDES:${PN} += "u-boot-pinephone-doc \
u-boot-pinephone-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
