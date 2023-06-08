SUMMARY = "Health-checker plugins for openSUSE MicroOS"
DESCRIPTION = "This package contains health-checker plugins for testing that \
the openSUSE MicroOS did boot correctly."
LICENSE = "GPL-2.0-only"

PV = "1.7"

RPM_NAME = "health-checker-plugins-MicroOS-1.7-1.2.noarch.rpm"
RPM_HASH = "a9fb8e0ad094ac2b835a0b72b7664152dba9f93584261bbf06ad45df695b17465ed2fee5feafb81b2bdbb49bcaa0b7d4fdb16744fa37412a410d2f051d8a6d72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker-plugins health-checker-plugins-MicroOS"
RDEPENDS:${PN} += "/bin/bash health-checker"

inherit rpm
