SUMMARY = "Documentation for texlive-anonymouspro"
DESCRIPTION = "This package includes the documentation for texlive-anonymouspro"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn51631"

RPM_NAME = "texlive-anonymouspro-doc-2023.201.2.2svn51631-54.1.noarch.rpm"
RPM_HASH = "9f56ff778b135aee81b7ecc250f7c551ca1ca743fc9ab80d10009e9f71cc5366702a91c1d91f85d2ddb9707bb28a82ec62a29d09d255e6931b2480c7b7628e84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anonymouspro-doc"
RDEPENDS:${PN} += ""

inherit rpm
