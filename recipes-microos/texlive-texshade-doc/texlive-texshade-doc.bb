SUMMARY = "Documentation for texlive-texshade"
DESCRIPTION = "This package includes the documentation for texlive-texshade"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.26asvn64242"

RPM_NAME = "texlive-texshade-doc-2023.201.1.26asvn64242-54.1.noarch.rpm"
RPM_HASH = "c89394abae94594300c642f473d6430e336cd759b3e4e7fec9a6f6441f87e5aed69b4d89a6be1772af54f497730e9c2e18e814015b68f513234fe07978446256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-texshade-doc:en) \
texlive-texshade-doc"
RDEPENDS:${PN} += ""

inherit rpm
