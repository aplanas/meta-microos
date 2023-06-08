SUMMARY = "GTK+ 3 support for the Adwaita GNOME theme"
DESCRIPTION = "Adwaita is the default GNOME theme in GNOME 3."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28"

RPM_NAME = "gtk3-metatheme-adwaita-3.28-1.20.noarch.rpm"
RPM_HASH = "7a0e4b4f0b5c422a96c3f0f07a3189c80e720de7f0d8cc5fe1a9a026903ddbfbce84af663955f7e9b21760ddb0022ad3d8d88fe5e5e91a1c89b0b8e16d474dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-adwaita"
RDEPENDS:${PN} += "cantarell-fonts metatheme-adwaita-common"

inherit rpm
