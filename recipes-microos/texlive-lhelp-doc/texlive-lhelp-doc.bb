SUMMARY = "Documentation for texlive-lhelp"
DESCRIPTION = "This package includes the documentation for texlive-lhelp"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.0svn23638"

RPM_NAME = "texlive-lhelp-doc-2023.201.2.0svn23638-54.1.noarch.rpm"
RPM_HASH = "568163d80074ec1e5041a05d1e87d0c7fd5554c18edeea99c45b0dcd5057a0d4921b29d34e03e39c911fa0fd5c94ef3001021356210af03021805a2b0d13415e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lhelp-doc"
RDEPENDS:${PN} += ""

inherit rpm
