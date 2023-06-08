SUMMARY = "Documentation for texlive-accsupp"
DESCRIPTION = "This package includes the documentation for texlive-accsupp"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn53052"

RPM_NAME = "texlive-accsupp-doc-2023.201.0.0.6svn53052-54.1.noarch.rpm"
RPM_HASH = "ee33aa5027125b4bd52406e12c35c0d5472205617bf1166141ee0ca02ba5433f8298791d36aa1e76e17de0615290476920187c4fe706e890214e9df9ced25311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-accsupp-doc"
RDEPENDS:${PN} += ""

inherit rpm
