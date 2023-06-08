SUMMARY = "Documentation for texlive-nag"
DESCRIPTION = "This package includes the documentation for texlive-nag"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn24741"

RPM_NAME = "texlive-nag-doc-2023.201.0.0.7svn24741-54.1.noarch.rpm"
RPM_HASH = "9b2c34fc8f3cf806be593c523eb6318ab9ecbfa527cc36a986709f0418dfa247c1279659d0173672a8b56020626c5fd4e40b00fba56a74a47ecee6ed4e54db89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nag-doc"
RDEPENDS:${PN} += ""

inherit rpm
