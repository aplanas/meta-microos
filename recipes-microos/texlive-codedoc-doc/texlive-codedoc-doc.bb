SUMMARY = "Documentation for texlive-codedoc"
DESCRIPTION = "This package includes the documentation for texlive-codedoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn17630"

RPM_NAME = "texlive-codedoc-doc-2023.201.0.0.3svn17630-53.1.noarch.rpm"
RPM_HASH = "e3530d44d1288a1678ad43319ae014541244da9c9fc4ca5b6fa944fef31b31700c9ec7d56e8595e18f3f7044fc242500d3136a2f50dfbd9889a8a4982f55339e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-codedoc-doc"
RDEPENDS:${PN} += ""

inherit rpm
