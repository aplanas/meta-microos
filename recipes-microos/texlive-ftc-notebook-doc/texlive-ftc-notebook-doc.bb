SUMMARY = "Documentation for texlive-ftc-notebook"
DESCRIPTION = "This package includes the documentation for texlive-ftc-notebook"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn50043"

RPM_NAME = "texlive-ftc-notebook-doc-2023.201.1.1svn50043-52.1.noarch.rpm"
RPM_HASH = "77dbe28cd83fd62cd93589e8d742f711f6bc62d6e4f74d21595dddc801976af26fe4dd1113dca96f437786ae29c33c1d459662e4015682978bd735f3401a19a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ftc-notebook-doc"
RDEPENDS:${PN} += ""

inherit rpm
