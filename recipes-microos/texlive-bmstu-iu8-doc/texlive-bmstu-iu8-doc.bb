SUMMARY = "Documentation for texlive-bmstu-iu8"
DESCRIPTION = "This package includes the documentation for texlive-bmstu-iu8"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61937"

RPM_NAME = "texlive-bmstu-iu8-doc-2023.201.1.2svn61937-52.1.noarch.rpm"
RPM_HASH = "6519ac4c2ee2765b934fe4490122e287cd6c389e05ee5eb99601e144a52b3fb39ba0fd5879d14389b4525990529648dd4bc92d7168bb0ad964a5c24ea4570b1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-bmstu-iu8-doc:ru) texlive-bmstu-iu8-doc"
RDEPENDS:${PN} += ""

inherit rpm
