SUMMARY = "Documentation for texlive-verbatimcopy"
DESCRIPTION = "This package includes the documentation for texlive-verbatimcopy"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.06svn15878"

RPM_NAME = "texlive-verbatimcopy-doc-2023.201.0.0.06svn15878-53.1.noarch.rpm"
RPM_HASH = "9e8144c09f521a83132b75eb2c533af786c10e42e68fd01c287b284234af67ac04eca59cd1a0741ba2012a190c53688cfa096613a3eeb66309cb611dd9f0520a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verbatimcopy-doc"
RDEPENDS:${PN} += ""

inherit rpm
