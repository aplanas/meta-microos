SUMMARY = "Documentation for texlive-fancyqr"
DESCRIPTION = "This package includes the documentation for texlive-fancyqr"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn64182"

RPM_NAME = "texlive-fancyqr-doc-2023.201.1.1svn64182-52.1.noarch.rpm"
RPM_HASH = "cd5057d484ddd950fe8bd1300c911d440d3bb26ec9c57e8aff5e63a17850331bcc82bd5ae39b97bb071ed805d29a4aba6341e83e3d86ff35838f303612121280"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyqr-doc"
RDEPENDS:${PN} += ""

inherit rpm
