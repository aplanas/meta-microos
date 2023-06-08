SUMMARY = "MicroOS Desktop default settings"
DESCRIPTION = "This package installs MicroOS default applications for Plasma."
LICENSE = "BSD-3-Clause"

PV = "20230420"

RPM_NAME = "plasma-branding-MicroOS-20230420-1.1.noarch.rpm"
RPM_HASH = "8c50b2a31fb13f6e290f74e1c48886cf21924367e5584afa592dc851afe041b35010f2c0d3d2c7ff7b2466bd52041fd85235e68855c47d0a1a979988636bf978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(plasma-branding-MicroOS) plasma-branding-MicroOS"
RDEPENDS:${PN} += "/bin/sh flatpak kdialog libqt5-qdbus sound-theme-freedesktop transactional-update"

inherit rpm
