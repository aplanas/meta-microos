SUMMARY = "Documentation for texlive-logical-markup-utils"
DESCRIPTION = "This package includes the documentation for texlive-logical-markup-utils"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-logical-markup-utils-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "c513e12302b468a9b966d06fb84809b9c2c457d74150a2f44adad574ebbaecc58ca14c8bd73e5c11a2fbb9cab6a264785eadcfbefe1bb8325c335ab1bae5398c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logical-markup-utils-doc"
RDEPENDS:${PN} += ""

inherit rpm
