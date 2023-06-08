SUMMARY = "Documentation for texlive-kurdishlipsum"
DESCRIPTION = "This package includes the documentation for texlive-kurdishlipsum"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47518"

RPM_NAME = "texlive-kurdishlipsum-doc-2023.201.1.1svn47518-55.1.noarch.rpm"
RPM_HASH = "3d48de9a9b795896d7765269e726a836ee773f4b7b7361633e6b10e3978deb642e9d7d3b950bfbda8f01408e21de9775dd239d00d3ca5ff54b0ba4811a22ae21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kurdishlipsum-doc"
RDEPENDS:${PN} += ""

inherit rpm
