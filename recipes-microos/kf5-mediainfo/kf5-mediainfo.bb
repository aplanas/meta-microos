SUMMARY = "KF5 extension for mediainfo-gui"
DESCRIPTION = "KF5 context menu extension for mediainfo-gui."
LICENSE = "GPL-2.0-or-later"

PV = "23.04"

RPM_NAME = "kf5-mediainfo-23.04-1.2.aarch64.rpm"
RPM_HASH = "a3ec68bdeaa9e0090b68a6476a0402826e164f9a10dcdee9226cdf526cd7870885e7c3a1f9bd16e432c5e289c6e8924b0eb65279e5575b611c01b4fe57cba9dc"

RPROVIDES:${PN} += "kde4-mediainfo kf5-mediainfo kf5-mediainfo(aarch-64)"
RDEPENDS:${PN} += "mediainfo-gui"

inherit rpm
