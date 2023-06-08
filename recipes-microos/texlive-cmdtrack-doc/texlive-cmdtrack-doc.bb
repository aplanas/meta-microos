SUMMARY = "Documentation for texlive-cmdtrack"
DESCRIPTION = "This package includes the documentation for texlive-cmdtrack"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28910"

RPM_NAME = "texlive-cmdtrack-doc-2023.201.svn28910-53.1.noarch.rpm"
RPM_HASH = "ae2772108a2a6c9e4cdedb4cbf7c0fecf9ccd33d190053c3db7671a6bd684d13ee1fce415efe2663a9666af838c4fffd71f57c918de8010f229fa4c8a237768b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmdtrack-doc"
RDEPENDS:${PN} += ""

inherit rpm
