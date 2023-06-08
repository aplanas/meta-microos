SUMMARY = "Periodic Table of Elements"
DESCRIPTION = "Kalzium shows a periodic table of the elements."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kalzium-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "88e308dea5f653be308a0ca5e18eaf9c1526bc78843ed695f3bb4fa8f8f8ae5b707ae5d34e67b2ba4b03f057cdec469342aa0d3b7bdb3938890b6ad92273b3a2"

RPROVIDES:${PN} += "kalzium-devel kalzium-devel(aarch-64)"
RDEPENDS:${PN} += "kalzium"

inherit rpm
