SUMMARY = "Documentation for texlive-texosquery"
DESCRIPTION = "This package includes the documentation for texlive-texosquery"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn53676"

RPM_NAME = "texlive-texosquery-doc-2023.201.1.7svn53676-54.1.noarch.rpm"
RPM_HASH = "29b2bc11c3f8c1829e356264e1c8dd565cec85e894c467d58db5548c40d815764e65667e1231cc6e1722f2b45557ad7dc456eba013f8e392dd60a25e1fc7fb7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texosquery-doc"
RDEPENDS:${PN} += ""

inherit rpm
