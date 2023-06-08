SUMMARY = "Documentation for texlive-logreq"
DESCRIPTION = "This package includes the documentation for texlive-logreq"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn53003"

RPM_NAME = "texlive-logreq-doc-2023.201.1.0svn53003-54.1.noarch.rpm"
RPM_HASH = "5b61739d2c99aa4abbe405f10d85c2c09c7b92408f5a8a5bc4f958a11950656f25889cb580e5943b4efc6132ce2c87dd27ecef0c4a5493b93437401145f2d691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logreq-doc"
RDEPENDS:${PN} += ""

inherit rpm
