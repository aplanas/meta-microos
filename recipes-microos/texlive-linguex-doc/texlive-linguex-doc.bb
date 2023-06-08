SUMMARY = "Documentation for texlive-linguex"
DESCRIPTION = "This package includes the documentation for texlive-linguex"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.3svn30815"

RPM_NAME = "texlive-linguex-doc-2023.201.4.3svn30815-54.1.noarch.rpm"
RPM_HASH = "194ed50ee980e80b6513ee2141563fdaff0b966b2164aca2dc439c7c08c315a0699e4a01dcd7a9f0cdbd746dc688abf6ce2ee0fa325cdcc0635871f3c523f245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linguex-doc"
RDEPENDS:${PN} += ""

inherit rpm
