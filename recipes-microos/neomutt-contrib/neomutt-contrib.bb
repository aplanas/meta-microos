SUMMARY = "Contrib scripts for Neomutt"
DESCRIPTION = "Examples, scripts and helpers that are distributed with Neomutt but are not \
maintained by the Neomutt authors."
LICENSE = "GPL-2.0-or-later"

PV = "20230407"

RPM_NAME = "neomutt-contrib-20230407-1.1.noarch.rpm"
RPM_HASH = "bf7e62ea800dcb39c5dbdb79a625484f962588810bcdf8a5f539bd809392c0cf878172b01abdcd4962f428d1d5dd25ce64b8f3d4a8163be2ab0e1ec267386f7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "neomutt-contrib"
RDEPENDS:${PN} += "/usr/bin/env neomutt"

inherit rpm
