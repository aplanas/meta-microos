SUMMARY = "Documentation for texlive-texmate"
DESCRIPTION = "This package includes the documentation for texlive-texmate"
LICENSE = "LPPL-1.0"

PV = "2023.201.2svn15878"

RPM_NAME = "texlive-texmate-doc-2023.201.2svn15878-54.1.noarch.rpm"
RPM_HASH = "789934bf85c6bbb19e39200f89fba287facc1a68d9af1c04efd04a4b0729ccdb3bb71af791caf59d0ba67c540a5645eab9fd6b1f8deeb5fa4c306d4d32e21b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texmate-doc"
RDEPENDS:${PN} += ""

inherit rpm
