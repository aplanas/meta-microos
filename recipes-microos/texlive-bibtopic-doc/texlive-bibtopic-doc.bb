SUMMARY = "Documentation for texlive-bibtopic"
DESCRIPTION = "This package includes the documentation for texlive-bibtopic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1asvn15878"

RPM_NAME = "texlive-bibtopic-doc-2023.201.1.1asvn15878-53.1.noarch.rpm"
RPM_HASH = "8bdbac9ee7a3b28fcff16821fbafb8eba199c77e40aabcdc57f36c3dfc180fe43c875446a113243bdd901199ffe910bc874d34403e9a2bc7909dda1569426d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibtopic-doc"
RDEPENDS:${PN} += ""

inherit rpm
