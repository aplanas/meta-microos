SUMMARY = "Documentation for texlive-beamertheme-pure-minimalistic"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-pure-minimalistic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.0.0svn56934"

RPM_NAME = "texlive-beamertheme-pure-minimalistic-doc-2023.201.2.0.0svn56934-53.1.noarch.rpm"
RPM_HASH = "8fb14af8353ba0e14077f8d4a170e9ed149979b6ce76123ef63b9fd3b579d3e12e69a248ebe5a5d788fd8ec4767ed8139cb94c32d28cd68b7699047c4e2c1a67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-pure-minimalistic-doc"
RDEPENDS:${PN} += ""

inherit rpm
