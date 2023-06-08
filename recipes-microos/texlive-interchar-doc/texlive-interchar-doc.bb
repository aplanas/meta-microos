SUMMARY = "Documentation for texlive-interchar"
DESCRIPTION = "This package includes the documentation for texlive-interchar"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn36312"

RPM_NAME = "texlive-interchar-doc-2023.201.0.0.2svn36312-52.1.noarch.rpm"
RPM_HASH = "f4390d9f0bd702baf189e570b995b286f0f19c000dc9ccd3588aa20c8144eea6aa4b2d9698b7fce2ef89eadee40acb11cd484122899404665b1621ed88496cc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interchar-doc"
RDEPENDS:${PN} += ""

inherit rpm
