SUMMARY = "Documentation for texlive-chemmacros"
DESCRIPTION = "This package includes the documentation for texlive-chemmacros"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.2asvn62655"

RPM_NAME = "texlive-chemmacros-doc-2023.201.6.2asvn62655-53.1.noarch.rpm"
RPM_HASH = "b8b79e4130e746146c1bf8d2b942d8af429f72aebd6ac585690da7afe3bf74d24c1647d89e382e31b4030fcf9b633b8c0e04d8b332d8c4b82c725c3bbac194ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-chemmacros-doc:en) texlive-chemmacros-doc"
RDEPENDS:${PN} += ""

inherit rpm
