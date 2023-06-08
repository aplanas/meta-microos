SUMMARY = "Documentation for texlive-germkorr"
DESCRIPTION = "This package includes the documentation for texlive-germkorr"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-germkorr-doc-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "30b2afc18d0452db553e554d8b107cf5420884d111f59377aea97eee398d3b851016c5ac1314d3123b59284ed4bc424db62c8a7675df368ecbdaa159e08a324f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-germkorr-doc"
RDEPENDS:${PN} += ""

inherit rpm
