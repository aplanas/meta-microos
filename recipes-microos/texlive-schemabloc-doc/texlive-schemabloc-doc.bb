SUMMARY = "Documentation for texlive-schemabloc"
DESCRIPTION = "This package includes the documentation for texlive-schemabloc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn58212"

RPM_NAME = "texlive-schemabloc-doc-2023.201.1.5svn58212-53.1.noarch.rpm"
RPM_HASH = "c9d977e41a4564e4d94ddccb75995e018f9ebafd9864d891425d1640fee5643810733464ed7668b7e912ecc218f1cbb055d5f543e769ed3acc6e90f761fe34ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-schemabloc-doc:fr) texlive-schemabloc-doc"
RDEPENDS:${PN} += ""

inherit rpm
