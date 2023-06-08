SUMMARY = "Documentation for texlive-datetime2-croatian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-croatian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36682"

RPM_NAME = "texlive-datetime2-croatian-doc-2023.201.1.0svn36682-52.1.noarch.rpm"
RPM_HASH = "43b5b6e5bd1c86a004eade15a6f4fa55eb3d63ea25b9b66ac4b038701a38a481571e62662193357d5e2c9735db63b54502d0d7831ec9ec6c2a8e4cd217a6a360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-croatian-doc"
RDEPENDS:${PN} += ""

inherit rpm
