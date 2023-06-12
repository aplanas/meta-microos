SUMMARY = "Upstream definitions of default settings and applications"
DESCRIPTION = "This package provides upstream defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.3"

RPM_NAME = "gio-branding-upstream-2.76.3-1.1.noarch.rpm"
RPM_HASH = "23d3b96b935b547fc84d1b35d17faeeae46f033d4168df48e3a1a2d6c5ef48f9424630cac0453038b875131d808328c225c166ca5212de84e8083696409ab746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(gio-branding-upstream) \
gio-branding \
gio-branding-upstream \
glib2-branding-upstream"
RDEPENDS:${PN} += "libgio-2_0-0"

inherit rpm
