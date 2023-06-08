SUMMARY = "The U-Boot firmware for the firefly-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the firefly-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-firefly-rk3399-2023.04-2.1.aarch64.rpm"
RPM_HASH = "5ab09634d915b76ee67dbcb8521b3a0fee812a579d104e701cc70c323ee28a5ba8e9d5d10e73fca9e4d75f0783ac79366005785959f61b7e2a85f7806e55303b"

RPROVIDES:${PN} += "u-boot-firefly-rk3399 u-boot-firefly-rk3399(aarch-64) u-boot-loader"
RDEPENDS:${PN} += ""

inherit rpm
