SUMMARY = "The GNOME Desktop Menu -- Upstream Menus Definitions"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
http://www.freedesktop.org/Standards/menu-spec \
 \
This package provides the upstream definitions for menus."
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.0"

RPM_NAME = "gnome-menus-branding-upstream-3.36.0-3.3.noarch.rpm"
RPM_HASH = "a3f01f6b12391c14bf7124f53906c5a919932209f6c1db8be95b70e93fd4954157e4ae5db77ffc8218fe74a2a50f8072901d77c09bcc85ce859441da2242371e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-menus-branding gnome-menus-branding-upstream"
RDEPENDS:${PN} += "gnome-menus"

inherit rpm
