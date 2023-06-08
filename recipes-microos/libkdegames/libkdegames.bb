SUMMARY = "General Data for KDE Games"
DESCRIPTION = "This package contains data which is required by the KDE games library."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libkdegames-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "d26428ebabb152d9d1df5286a5e8487df504ff1a5f20a306a7d18c9010f2d9b3f223e9c40f3e171ecbe394117d34a3a999322eb35ca2e0cbe533d8d2a4c9339d"

RPROVIDES:${PN} += "libkdegames libkdegames(aarch-64) libkdegames-kf5"
RDEPENDS:${PN} += ""

inherit rpm
