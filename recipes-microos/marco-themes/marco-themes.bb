SUMMARY = "MATE window manager themes"
DESCRIPTION = "Marco is a small window manager, using GTK+ to do everything. It is \
developed mainly for the MATE Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "marco-themes-1.26.1-1.3.noarch.rpm"
RPM_HASH = "d1d9ed372a581f99a41c9c724eaeefd2f5f652f35f57789a32c1fc68a1990ed546cf1665198ea1027ff2c70ba5344bfedf76e757b5c310880a39ca324d3edebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "marco-themes mate-window-manager-themes"
RDEPENDS:${PN} += ""

inherit rpm
