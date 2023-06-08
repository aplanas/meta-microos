SUMMARY = "GNOME Desktop Environment (X11)"
DESCRIPTION = "The GNOME desktop environment is an intuitive and attractive desktop for users. \
This pattern installs a full featured GNOME desktop environment, including \
Office suite, E-Mail client, Web Browser, File Manager, running with X11 \
technology."
LICENSE = "MIT"

PV = "20201210"

RPM_NAME = "patterns-gnome-gnome_x11-20201210-16.1.aarch64.rpm"
RPM_HASH = "2ac9b67fc76354fb3963b33642279c1b8864e6680154e5d371c99c905eaea2b63b92d3001eeb33cc57cde13023306e96dd0e370365ca1fb1049263513fb2a505"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-gnome-gnome_x11 patterns-gnome-gnome_x11(aarch-64) patterns-openSUSE-gnome"
RDEPENDS:${PN} += "gnome-user-share pattern() seahorse totem xdg-user-dirs-gtk"

inherit rpm
