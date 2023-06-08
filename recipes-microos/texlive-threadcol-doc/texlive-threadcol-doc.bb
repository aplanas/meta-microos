SUMMARY = "Documentation for texlive-threadcol"
DESCRIPTION = "This package includes the documentation for texlive-threadcol"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn28754"

RPM_NAME = "texlive-threadcol-doc-2023.201.1.0svn28754-54.1.noarch.rpm"
RPM_HASH = "74c01acb605c4dfaeec777fd7ab1ed085044c7178360f3d93736e487fbff8df846d0c0051014d5bd50cc631404c0c15fe8726cee0db425db752fe5de5437ff63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-threadcol-doc"
RDEPENDS:${PN} += ""

inherit rpm
