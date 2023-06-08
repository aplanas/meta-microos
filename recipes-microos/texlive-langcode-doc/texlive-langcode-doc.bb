SUMMARY = "Documentation for texlive-langcode"
DESCRIPTION = "This package includes the documentation for texlive-langcode"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn27764"

RPM_NAME = "texlive-langcode-doc-2023.201.0.0.2svn27764-55.1.noarch.rpm"
RPM_HASH = "35bb3d792af93df5367fa8a065ca58f687cb2b66cf9d5c020df663bb435f8b9d08f4d97d11d62cb0cf1380528797d61e2aa6760f70c3bac7b34ea390bf366db0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-langcode-doc"
RDEPENDS:${PN} += ""

inherit rpm
