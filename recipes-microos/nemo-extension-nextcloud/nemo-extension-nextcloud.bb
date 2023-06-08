SUMMARY = "Nemo overlay icons"
DESCRIPTION = "This package provides overlay icons to visualise the \
synchronisation state in the Nemo file manager."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.1"

RPM_NAME = "nemo-extension-nextcloud-3.8.1-1.1.noarch.rpm"
RPM_HASH = "b765dc00a6573c414ff7eaa6898999bb82db80622798faa650eb4b67711e8a4faef63ea0b39ec769b2dabb30cda96b687d4dca438ee487294755310cd6a0e44b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-nextcloud"
RDEPENDS:${PN} += "nemo nextcloud-desktop python-nemo typelib(GObject) typelib(Nemo)"

inherit rpm
