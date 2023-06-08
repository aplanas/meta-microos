SUMMARY = "Documentation for texlive-foilhtml"
DESCRIPTION = "This package includes the documentation for texlive-foilhtml"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61937"

RPM_NAME = "texlive-foilhtml-doc-2023.201.1.2svn61937-52.1.noarch.rpm"
RPM_HASH = "2db51eb26255233c358a458a192d7b13726592331a3a5df7efdf64254d6f2bd6fc358156e88a810b1dae15924062f0ffe9b06eaa7dee1f1e01426fb2051cbb32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-foilhtml-doc"
RDEPENDS:${PN} += ""

inherit rpm
