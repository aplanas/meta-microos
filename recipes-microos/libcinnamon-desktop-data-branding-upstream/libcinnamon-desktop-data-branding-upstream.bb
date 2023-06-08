SUMMARY = "Upstream definitions of default settings and applications"
DESCRIPTION = "This package provides upstream defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.6.2"

RPM_NAME = "libcinnamon-desktop-data-branding-upstream-5.6.2-1.1.noarch.rpm"
RPM_HASH = "0541ad98cd67285edad6d9af36ba3635b579d2ce0d40215461a7cbbbebf333c8279a6bddb51dc05db11b359239806bcc9c1b9052013c72c4b9cd7bd1a3b4e988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcinnamon-desktop-data-branding libcinnamon-desktop-data-branding-upstream"
RDEPENDS:${PN} += "gnome-backgrounds libcinnamon-desktop-data metatheme-adwaita-common"

inherit rpm
