SUMMARY = "Documentation for texlive-textopo"
DESCRIPTION = "This package includes the documentation for texlive-textopo"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.5svn23796"

RPM_NAME = "texlive-textopo-doc-2023.201.1.5svn23796-54.1.noarch.rpm"
RPM_HASH = "4a39000b7d4f409b083c2fd397218a8f76937f3a050b18b6d8150eeaa70fa3ab553b432b84c41d6d1fa8c799280c7caa531e6b1e99bc981afafb317a1a3d0524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textopo-doc"
RDEPENDS:${PN} += ""

inherit rpm
