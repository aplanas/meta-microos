SUMMARY = "The U-Boot firmware for the pinebook platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pinebook platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pinebook-2023.04-2.1.aarch64.rpm"
RPM_HASH = "99b29ac104604e9f7eb687d9cfa7576c26b523104038e984a262b05be6ce4f185c44a4585a232dd98c3da758df591d2e9db4dcf4d4aa6bacb28c54281ca68e5b"

RPROVIDES:${PN} += "u-boot-loader u-boot-pinebook u-boot-pinebook(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
