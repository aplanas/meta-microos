SUMMARY = "Documentation for texlive-hypernat"
DESCRIPTION = "This package includes the documentation for texlive-hypernat"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0bsvn17358"

RPM_NAME = "texlive-hypernat-doc-2023.201.1.0bsvn17358-52.1.noarch.rpm"
RPM_HASH = "cebb9965d6ce6a0587eb560294ad0bd483d411b84021465e21e288048e4df5f4baec28d997e9ca0985a4683d9616b8a9af2ebcc9d5840b6f8725dcaa2cf26aef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hypernat-doc"
RDEPENDS:${PN} += ""

inherit rpm
