SUMMARY = "Documentation for texlive-tangramtikz"
DESCRIPTION = "This package includes the documentation for texlive-tangramtikz"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.5svn66183"

RPM_NAME = "texlive-tangramtikz-doc-2023.201.0.0.1.5svn66183-54.1.noarch.rpm"
RPM_HASH = "d7720598f92a644d4a81fa21dd7b1f97c5784df7c75b8eb244d72f1c2858aac53d67808440cd63d595cad3e07bb5254e632f2b5d982b5acda331750e6b738e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tangramtikz-doc:fr) texlive-tangramtikz-doc"
RDEPENDS:${PN} += ""

inherit rpm
