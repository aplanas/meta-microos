SUMMARY = "Plasma branding for GRUB2's graphical console"
DESCRIPTION = "Plasma branding for the GRUB2's graphical console."
LICENSE = "GPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "grub2-theme-breeze-5.27.5-1.1.noarch.rpm"
RPM_HASH = "ed19cb1810f1e181c256b0236b4c93e4b23bf674fe2c45541a36709a94ba4a00d14a7e2ef9da971492f53afb7ea986b96303041faea9d662a5959b9d9aa149ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-theme-breeze"
RDEPENDS:${PN} += ""

inherit rpm
