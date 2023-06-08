SUMMARY = "Documentation for texlive-epspdfconversion"
DESCRIPTION = "This package includes the documentation for texlive-epspdfconversion"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.61svn18703"

RPM_NAME = "texlive-epspdfconversion-doc-2023.201.0.0.61svn18703-53.1.noarch.rpm"
RPM_HASH = "ec89d19b1537fe5bc61c597f5ee0bfa39ef4376a1afb68be3ab7c594f4ec16cd759f147be6cc1d7879f5b75e50b58d59efcfdbaa4f361d2ba0845de594c06e15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epspdfconversion-doc"
RDEPENDS:${PN} += ""

inherit rpm
