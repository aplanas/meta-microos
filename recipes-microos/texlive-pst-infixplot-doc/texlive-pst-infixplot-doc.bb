SUMMARY = "Documentation for texlive-pst-infixplot"
DESCRIPTION = "This package includes the documentation for texlive-pst-infixplot"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn15878"

RPM_NAME = "texlive-pst-infixplot-doc-2023.201.0.0.11svn15878-52.1.noarch.rpm"
RPM_HASH = "99f5407a54009287622c366ad587a77338e21dc96bde2fa9f3bff7a20cfe2ca0e66a9fe2d37a9b13f65e9ae70460fafe3f052a564bec13232d90ba8a03f2d02d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-infixplot-doc"
RDEPENDS:${PN} += ""

inherit rpm
