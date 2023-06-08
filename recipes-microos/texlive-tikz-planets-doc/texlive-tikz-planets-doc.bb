SUMMARY = "Documentation for texlive-tikz-planets"
DESCRIPTION = "This package includes the documentation for texlive-tikz-planets"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn55002"

RPM_NAME = "texlive-tikz-planets-doc-2023.201.1.0.2svn55002-52.1.noarch.rpm"
RPM_HASH = "eab91758c49116dc8fe437aebbbd0c43b3ad0b65cd5b27aaf22f9ddc2159225c082c307bc0fb74c3a01de9e06f5e1a5a10f03ee622725ae4fd1a402557b53228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-planets-doc"
RDEPENDS:${PN} += ""

inherit rpm
