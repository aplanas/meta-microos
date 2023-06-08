SUMMARY = "Documentation for texlive-bibleref"
DESCRIPTION = "This package includes the documentation for texlive-bibleref"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.25svn55626"

RPM_NAME = "texlive-bibleref-doc-2023.201.1.25svn55626-53.1.noarch.rpm"
RPM_HASH = "4ad7585347f4d4218114a11a3d1e78c3bd3abebf6a0e3430ab638aa5142f514b2d7799d25d9e5ca1a5713516de40ef6114a42914f4579ae743cf318a73b852e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibleref-doc"
RDEPENDS:${PN} += ""

inherit rpm
