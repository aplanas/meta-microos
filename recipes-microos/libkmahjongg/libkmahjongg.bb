SUMMARY = "General Data for KDE Games"
DESCRIPTION = "This package contains data which is required by KDE games."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkmahjongg-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "793993a268a2f3242316136f6b9c23dbf616effd6f8eab22a617cb25a768ec225af3a7a886fae41a59de110b6c0e323429c0ce7b29b1e07591195966d9e6e7d2"

RPROVIDES:${PN} += "libkmahjongg libkmahjongg(aarch-64) libkmahjongg-kf5"
RDEPENDS:${PN} += ""

inherit rpm
