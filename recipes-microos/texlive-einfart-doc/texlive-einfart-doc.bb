SUMMARY = "Documentation for texlive-einfart"
DESCRIPTION = "This package includes the documentation for texlive-einfart"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65475"

RPM_NAME = "texlive-einfart-doc-2023.201.svn65475-53.1.noarch.rpm"
RPM_HASH = "6c0182d270e949f8e3e919171e135d79506a7d0b53c0c987241aac9831db6022b43171a29a67468b1a06b7db17ac5e1aecaccfd3926aaeb897e0e3c7939ffcee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-einfart-doc"
RDEPENDS:${PN} += ""

inherit rpm
