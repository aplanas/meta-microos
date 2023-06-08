SUMMARY = "Documentation for texlive-babel-kurmanji"
DESCRIPTION = "This package includes the documentation for texlive-babel-kurmanji"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn30279"

RPM_NAME = "texlive-babel-kurmanji-doc-2023.201.1.1svn30279-53.1.noarch.rpm"
RPM_HASH = "aacdbcee7f57e97195f40f81140a99fae4b36cc56bf14fbffeaa5adee8501efaf4c4fa82467d1478754fb100576a959f133a186dc31e88b324872f44ffbba140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-kurmanji-doc"
RDEPENDS:${PN} += ""

inherit rpm
