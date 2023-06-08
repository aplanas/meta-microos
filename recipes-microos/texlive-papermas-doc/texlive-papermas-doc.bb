SUMMARY = "Documentation for texlive-papermas"
DESCRIPTION = "This package includes the documentation for texlive-papermas"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0hsvn23667"

RPM_NAME = "texlive-papermas-doc-2023.201.1.0hsvn23667-51.1.noarch.rpm"
RPM_HASH = "7638252eebb0a3b4151dd36bf3d98fe03cee0ac9304db0a28b66e8ae76960ead0bc3efd7cfd833d6119f84de8b93517b75f108189beb95ed7de7d9e6e99b4234"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-papermas-doc"
RDEPENDS:${PN} += ""

inherit rpm
