SUMMARY = "Development files for Rocs"
DESCRIPTION = "This package provides development files and headers needed \
to build software using Rocs."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "rocs-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "7edac74098cb14c62d385566768ac64f565b8b51ca141a896fbf549dc9e23a674af5b893501652f62aea9f8070d5992b564b596a31ce4e61069f5768027fced2"

RPROVIDES:${PN} += "rocs-devel rocs-devel(aarch-64)"
RDEPENDS:${PN} += "librocsgraphtheory0"

inherit rpm
