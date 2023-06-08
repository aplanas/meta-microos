SUMMARY = "Documentation for texlive-gitstatus"
DESCRIPTION = "This package includes the documentation for texlive-gitstatus"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64662"

RPM_NAME = "texlive-gitstatus-doc-2023.201.1.1svn64662-53.1.noarch.rpm"
RPM_HASH = "bbbff098d61f64e2d3b5088dd4e6f172ba972e50f4b2fe1bfdbfaf884ac8b894dfcdebd86d14b129707aa9936b625690c4b4ebb84930376ab457cb91dd82123b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitstatus-doc"
RDEPENDS:${PN} += ""

inherit rpm
