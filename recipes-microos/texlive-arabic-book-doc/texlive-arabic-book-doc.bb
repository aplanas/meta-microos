SUMMARY = "Documentation for texlive-arabic-book"
DESCRIPTION = "This package includes the documentation for texlive-arabic-book"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn59594"

RPM_NAME = "texlive-arabic-book-doc-2023.201.1.0svn59594-54.1.noarch.rpm"
RPM_HASH = "08287c4a08aeab9c69e6a8152b3cd6af51b1720e64e5057b474892e82fffd2d851d03940b0f8eca793bc5779c05b967db309f961282182ecbe96228a98b41d3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabic-book-doc"
RDEPENDS:${PN} += ""

inherit rpm
