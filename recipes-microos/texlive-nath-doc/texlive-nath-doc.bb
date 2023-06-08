SUMMARY = "Documentation for texlive-nath"
DESCRIPTION = "This package includes the documentation for texlive-nath"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-nath-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "807acc7d60be0ccd61d7c8de089642e353aa6a4aed0bb37457e73aeffb9c6b8ba70d07e12296ddcd201861505f97cbf119c8b2fcd499c1eb891dc78af69036a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nath-doc"
RDEPENDS:${PN} += ""

inherit rpm
