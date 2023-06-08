SUMMARY = "Documentation for texlive-pst-dbicons"
DESCRIPTION = "This package includes the documentation for texlive-pst-dbicons"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.16svn17556"

RPM_NAME = "texlive-pst-dbicons-doc-2023.201.0.0.16svn17556-52.1.noarch.rpm"
RPM_HASH = "e0d9a066c5a7532828b8c510081cd7d6ddc75acf93711b954516a0cb7eb82c20553c07c513dd6123542d2883d673231fd74d03ca8e6739e9dce074467638d731"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-dbicons-doc"
RDEPENDS:${PN} += ""

inherit rpm
