SUMMARY = "Additional Documentation about Mutt"
DESCRIPTION = "Some extend documentation about mutt together with muttrc examples \
for different environments and requirements."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.10"

RPM_NAME = "mutt-doc-2.2.10-2.1.noarch.rpm"
RPM_HASH = "24202ee8bc2a8ceb997d7fd844af453b04ab9e4963e560dfdfb6d54d5060ad70af3695242ee3b547507bb517872551d3b9ab370c895b99dedbb099ee4f0e5caf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mutt-doc \
mutt:/usr/share/doc/packages/mutt/COPYRIGHT"
RDEPENDS:${PN} += "/bin/sh \
mutt"

inherit rpm
