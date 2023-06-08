SUMMARY = "Default session support for the GNOME Session Manager"
DESCRIPTION = "This package contains the definition of the default GNOME session."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-session-default-session-44.0-1.1.aarch64.rpm"
RPM_HASH = "07d1d8ba23ac480370c9b22f972466157f1dde6b8af6b89139d48dc69c608ba586554c51efecb8ab21b29cccd7fd6de88f42e35026843e4d416e6abd04bea090"

RPROVIDES:${PN} += "gnome-session-default-session gnome-session-default-session(aarch-64)"
RDEPENDS:${PN} += "gnome-session gnome-settings-daemon gnome-shell"

inherit rpm
