SUMMARY = "The U-Boot firmware for the p3450-0000 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the p3450-0000 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-p3450-0000-2023.04-2.1.aarch64.rpm"
RPM_HASH = "59a18a804ee7fc337878ac299aee6a84387e8aaefe2b3de85f5b361271677c12d63a0e372d6289c7559a21bef67ae0581c5fdbfd457cc9e8d0ac8b0a10c90068"

RPROVIDES:${PN} += "u-boot-loader u-boot-p3450-0000 u-boot-p3450-0000(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
