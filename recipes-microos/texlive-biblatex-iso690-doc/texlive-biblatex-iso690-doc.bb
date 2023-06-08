SUMMARY = "Documentation for texlive-biblatex-iso690"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-iso690"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn62866"

RPM_NAME = "texlive-biblatex-iso690-doc-2023.201.0.0.4.1svn62866-53.1.noarch.rpm"
RPM_HASH = "378726d7be78bfff3541e6d30160fcd1b02f4b3f8bb0b07db5425730ede0c00196860ad85584d2e6f5f1d252b581bf8491fb128c784ec0dce88161a2f51712d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-iso690-doc"
RDEPENDS:${PN} += ""

inherit rpm
