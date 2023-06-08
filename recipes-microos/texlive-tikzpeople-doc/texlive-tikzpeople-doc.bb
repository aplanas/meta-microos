SUMMARY = "Documentation for texlive-tikzpeople"
DESCRIPTION = "This package includes the documentation for texlive-tikzpeople"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn43978"

RPM_NAME = "texlive-tikzpeople-doc-2023.201.0.0.4svn43978-52.1.noarch.rpm"
RPM_HASH = "c600f2146a507df6ab5bd009e18c6b142b17f4226e348a428d9e0873c94fd4c76d8071d683a9e913bdc94a352302cbbf6cd10ec71b3e75d81e746a9db9530a28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzpeople-doc"
RDEPENDS:${PN} += ""

inherit rpm
