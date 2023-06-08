SUMMARY = "Documentation for texlive-cd-cover"
DESCRIPTION = "This package includes the documentation for texlive-cd-cover"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn17121"

RPM_NAME = "texlive-cd-cover-doc-2023.201.1.0svn17121-52.1.noarch.rpm"
RPM_HASH = "36fe113926b7ad3a95f891347e73dcef29c1459a7c5cc0cd02d4be3cd316716ec5fedef2568cd3b05576985da91902abb15495cb9a777f389589790a5bb22691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cd-cover-doc"
RDEPENDS:${PN} += ""

inherit rpm
