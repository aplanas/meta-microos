SUMMARY = "Session Tools for the GNOME Desktop"
DESCRIPTION = "This package provides the basic session tools, like session management \
functionality, for the GNOME Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-session-44.0-1.1.aarch64.rpm"
RPM_HASH = "1930ec20848848f8d1bf24e6c4305ae0f5db3f6a7510aaf54334bb4cf487be13efc73d0572b3557737839781b5ded3021d6a62f6c6acbeead4b52c6d8610dba2"

RPROVIDES:${PN} += "gnome-session gnome-session(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh gnome-session-core gnome-session-default-session"

inherit rpm
