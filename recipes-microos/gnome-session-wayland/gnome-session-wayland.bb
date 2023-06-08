SUMMARY = "Wayland support for the GNOME Session Manager"
DESCRIPTION = "This package contains the definition of the default GNOME session on Wayland."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-session-wayland-44.0-1.1.aarch64.rpm"
RPM_HASH = "9f8e6b0033f8a10465d47f5d3eb53639704d0aa3511571b95209bf98333584ccaaada476f9af7e0f5ea7dc69c6cddae9443e28565e5a4fc8f3c11b3e8626ca8f"

RPROVIDES:${PN} += "gnome-session-wayland gnome-session-wayland(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnome-session gnome-settings-daemon xorg-x11-server-wayland"

inherit rpm
