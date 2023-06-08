SUMMARY = "Documentation for texlive-datax"
DESCRIPTION = "This package includes the documentation for texlive-datax"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.2.0svn61772"

RPM_NAME = "texlive-datax-doc-2023.204.1.2.0svn61772-54.1.noarch.rpm"
RPM_HASH = "c6f519d901af6c415fe2aa480f1482ee1e08c03d51ce06fa97e5ffdce1ae19c370dbaab010dc77b41c08caf375a3975f68c680ee84180b78b27f5197e0fb117e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datax-doc"
RDEPENDS:${PN} += ""

inherit rpm
