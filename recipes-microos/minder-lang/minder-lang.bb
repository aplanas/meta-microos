SUMMARY = "Translations for package minder"
DESCRIPTION = "Provides translations for the 'minder' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.14.0"

RPM_NAME = "minder-lang-1.14.0-1.8.noarch.rpm"
RPM_HASH = "207794930453b038db875ed8399674fe9f5689f53fa9dd77ad220d78b20d463f761627efb9c28e26e021b9a06e381c67e025c478878c515ef7bd3643cff18df9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(minder:cs) \
locale(minder:de) \
locale(minder:es) \
locale(minder:fr) \
locale(minder:it) \
locale(minder:nl) \
locale(minder:pl) \
locale(minder:pt) \
locale(minder:pt_BR) \
locale(minder:ru) \
minder-lang \
minder-lang-all"
RDEPENDS:${PN} += "minder"

inherit rpm
