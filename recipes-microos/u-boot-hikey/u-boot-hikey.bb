SUMMARY = "The U-Boot firmware for the hikey platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the hikey platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-hikey-2023.04-2.1.aarch64.rpm"
RPM_HASH = "46ec95c1a8711c6898ab63cd5ac06aad55475ef67685e4768441ded282cf339be394f3769241fbf798d9e6cf5d906f600a8080a547e9df256e73478ba0cdbb64"

RPROVIDES:${PN} += "u-boot-hikey u-boot-hikey(aarch-64) u-boot-loader"
RDEPENDS:${PN} += ""

inherit rpm
