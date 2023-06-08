SUMMARY = "Documentation for texlive-ifmslide"
DESCRIPTION = "This package includes the documentation for texlive-ifmslide"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.47svn20727"

RPM_NAME = "texlive-ifmslide-doc-2023.201.0.0.47svn20727-52.1.noarch.rpm"
RPM_HASH = "5f042b2bbbb6f8688dc55fcf544bcd18fa2b9646fa9feaf14140e553cc54c54a2a0f98281091764bcc71a82066c293cde50a647d506b5f7954d9fddebc173012"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifmslide-doc"
RDEPENDS:${PN} += ""

inherit rpm
