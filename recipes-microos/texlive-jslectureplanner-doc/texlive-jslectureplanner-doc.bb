SUMMARY = "Documentation for texlive-jslectureplanner"
DESCRIPTION = "This package includes the documentation for texlive-jslectureplanner"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12svn57095"

RPM_NAME = "texlive-jslectureplanner-doc-2023.201.1.12svn57095-55.1.noarch.rpm"
RPM_HASH = "aff02cf8f08d988b5fa9f188cb8db6a66dbbe15f5194385bd2a29614809b1c7993a0fbc672a98aa2edc0aac68a39c120c58b3de74cb5902f2e5cb22225649930"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jslectureplanner-doc"
RDEPENDS:${PN} += ""

inherit rpm
