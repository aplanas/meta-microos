SUMMARY = "Translations for package mate-applet-dock"
DESCRIPTION = "Provides translations for the 'mate-applet-dock' package."
LICENSE = "GPL-2.0-or-later"

PV = "21.10.0"

RPM_NAME = "mate-applet-dock-lang-21.10.0-1.6.noarch.rpm"
RPM_HASH = "caea175f1c3a8a2452b841ac8129070a030ec12bbd471693139a64fc0d7d2cb395e88d46e5b5041a5d33e004c9df8a2e3d81a94eb0d8a9e498acc0c27b83e10b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-applet-dock:es) locale(mate-applet-dock:fr) mate-applet-dock-lang mate-applet-dock-lang-all"
RDEPENDS:${PN} += "mate-applet-dock"

inherit rpm
