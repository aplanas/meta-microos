SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-firefly-rk3399-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "5908963bf6ae923eed9ec756e4c307b14edd92e3c0b4f9939da14f74e091fd471f6b85e73e5d37fca6430d8fe363cec1092654b34b587e95c8238dcb82829434"

RPROVIDES:${PN} += "u-boot-firefly-rk3399-doc u-boot-firefly-rk3399-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
