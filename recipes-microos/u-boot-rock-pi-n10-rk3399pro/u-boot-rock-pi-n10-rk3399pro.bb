SUMMARY = "The U-Boot firmware for the rock-pi-n10-rk3399pro platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock-pi-n10-rk3399pro platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rock-pi-n10-rk3399pro-2023.04-2.1.aarch64.rpm"
RPM_HASH = "6f8cce205d48aa069b90dc58931f1b8e4466f12d5dda293b573e4bcdf1f72ed2f381bddea1c43cd89f6cf3762394921e03c3f9e6129fae88eaf80b61e13c8112"

RPROVIDES:${PN} += "u-boot-loader u-boot-rock-pi-n10-rk3399pro u-boot-rock-pi-n10-rk3399pro(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
