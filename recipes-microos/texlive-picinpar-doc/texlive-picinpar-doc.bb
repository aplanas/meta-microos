SUMMARY = "Documentation for texlive-picinpar"
DESCRIPTION = "This package includes the documentation for texlive-picinpar"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn65097"

RPM_NAME = "texlive-picinpar-doc-2023.201.1.3svn65097-51.1.noarch.rpm"
RPM_HASH = "1c465a575e95a054f2d601df5d895c625fc7074e48781acefa60f0d595630f6c835cfe232547997ef999d28f1f1e3a1ca5265f285d384983ab50d49d7793691e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-picinpar-doc:de;en) texlive-picinpar-doc"
RDEPENDS:${PN} += ""

inherit rpm
