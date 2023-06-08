SUMMARY = "Documentation for texlive-hlist"
DESCRIPTION = "This package includes the documentation for texlive-hlist"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn44983"

RPM_NAME = "texlive-hlist-doc-2023.201.0.0.11svn44983-53.1.noarch.rpm"
RPM_HASH = "3f6e74e9b20b9ad7e960a46987e286f06d0be17c4b2b27eaa3fb23373a1a5c8cd2099e1d1818fc3bf83ef5197a4c119d185c51555b8da99d48fe1ad51c6aa3c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hlist-doc"
RDEPENDS:${PN} += ""

inherit rpm
