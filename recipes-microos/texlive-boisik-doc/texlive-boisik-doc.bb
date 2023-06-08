SUMMARY = "Documentation for texlive-boisik"
DESCRIPTION = "This package includes the documentation for texlive-boisik"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.5svn15878"

RPM_NAME = "texlive-boisik-doc-2023.201.0.0.5svn15878-52.1.noarch.rpm"
RPM_HASH = "a67f36b5813d7289158e0f88d2d6b7d998fe889cd17868e67e7871dd5108e2519f63a54571811c8c08b5f773e698108aea53e0677f84c58275e7650004413d7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-boisik-doc:cs) texlive-boisik-doc"
RDEPENDS:${PN} += ""

inherit rpm
