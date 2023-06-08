SUMMARY = "Documentation for texlive-asymptote"
DESCRIPTION = "This package includes the documentation for texlive-asymptote"
LICENSE = "LGPL-3.0-or-later"

PV = "2023.201.2.85svn65952"

RPM_NAME = "texlive-asymptote-doc-2023.201.2.85svn65952-53.1.noarch.rpm"
RPM_HASH = "62786afbc6f6193d0c075ee6bc3df780500f2eca91e929ec9572ee59b3b9eeb8c6351f21d8ac71e0695433bd9625e11fe4c238e5aa4c7e835f5e286831069844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(asy.1) man(xasy.1) texlive-asymptote-doc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
