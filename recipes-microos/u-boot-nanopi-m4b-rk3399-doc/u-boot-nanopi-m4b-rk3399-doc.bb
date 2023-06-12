SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-nanopi-m4b-rk3399-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "e7b037441db9a481f2553923074907c8edb5a9ce5db5ea035b3bda2de1c0b4499cc837b5a4d7e0a56a73ecc18ec1f4da8f8a26c4e0b4250d400f0bb3f291f005"

RPROVIDES:${PN} += "u-boot-nanopi-m4b-rk3399-doc \
u-boot-nanopi-m4b-rk3399-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
