SUMMARY = "The U-Boot firmware for the ls1012afrdmqspi platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the ls1012afrdmqspi platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-ls1012afrdmqspi-2023.04-2.1.aarch64.rpm"
RPM_HASH = "184bc66578627e8e3cba3b7cfd48c84bd9eb940b5260bfdddf1fe7b2ff31d196078329939686252c8a09ad6ac5ffd565c9b42ac48ee8e5beee74c09708ce4c16"

RPROVIDES:${PN} += "u-boot-loader u-boot-ls1012afrdmqspi u-boot-ls1012afrdmqspi(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
