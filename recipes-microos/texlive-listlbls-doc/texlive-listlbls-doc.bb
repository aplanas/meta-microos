SUMMARY = "Documentation for texlive-listlbls"
DESCRIPTION = "This package includes the documentation for texlive-listlbls"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn34893"

RPM_NAME = "texlive-listlbls-doc-2023.201.1.03svn34893-54.1.noarch.rpm"
RPM_HASH = "3f81f17c66377cb6971fffc2c0b7c591d8dde93506f63407a8f8186c60fc4e09ed424d9297208de0fee31850c50174ae65fa0ce88c51b77d2d0ef65cae63be22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listlbls-doc"
RDEPENDS:${PN} += ""

inherit rpm
