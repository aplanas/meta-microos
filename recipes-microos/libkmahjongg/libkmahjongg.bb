SUMMARY = "General Data for KDE Games"
DESCRIPTION = "This package contains data which is required by KDE games."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libkmahjongg-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "3a8467068dc83d7920208d1816e994ed7168f75425ed6735b461b51f7a762050f765f5e77d132c47d5b026dcac821406278cf8125ac7cc2e471d9eb2cf77b5c2"

RPROVIDES:${PN} += "libkmahjongg libkmahjongg(aarch-64) libkmahjongg-kf5"
RDEPENDS:${PN} += ""

inherit rpm
