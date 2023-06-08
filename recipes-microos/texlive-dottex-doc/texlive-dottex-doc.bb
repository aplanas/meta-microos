SUMMARY = "Documentation for texlive-dottex"
DESCRIPTION = "This package includes the documentation for texlive-dottex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.6svn15878"

RPM_NAME = "texlive-dottex-doc-2023.201.0.0.6svn15878-52.1.noarch.rpm"
RPM_HASH = "688998b121a3a164cdff34f64d73bd5d302efea4dd7680fca0568b7f4aca03d8732ae890089bbf3c1fff3c368fbf7f1ca210186b5e282fd300468fbe25c8b30f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dottex-doc"
RDEPENDS:${PN} += ""

inherit rpm
