SUMMARY = "Documentation for texlive-histogr"
DESCRIPTION = "This package includes the documentation for texlive-histogr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn15878"

RPM_NAME = "texlive-histogr-doc-2023.201.1.01svn15878-53.1.noarch.rpm"
RPM_HASH = "c68bbabed73836a36e97665882b83c291a905c594bb23ba6aa9cc44666ab0b7f8ead5d3cc8dcb7919781197d3417ff6d11f166f7af0fd262c27d6db9f076a3ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-histogr-doc"
RDEPENDS:${PN} += ""

inherit rpm
