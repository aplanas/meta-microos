SUMMARY = "Documentation for texlive-spreadtab"
DESCRIPTION = "This package includes the documentation for texlive-spreadtab"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn50147"

RPM_NAME = "texlive-spreadtab-doc-2023.201.0.0.5svn50147-57.1.noarch.rpm"
RPM_HASH = "bc55acc671bf2db2e3c84156f3693e03081c608044fc7c9520f1f09bd765fed5aadb25fb32dfd5b8b1ac79e7699fbd20b6e617783d52065e25d271f1d0e3a5db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-spreadtab-doc:en;fr) texlive-spreadtab-doc"
RDEPENDS:${PN} += ""

inherit rpm
