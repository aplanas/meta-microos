SUMMARY = "Documentation for texlive-hep-acronym"
DESCRIPTION = "This package includes the documentation for texlive-hep-acronym"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64890"

RPM_NAME = "texlive-hep-acronym-doc-2023.201.1.1svn64890-53.1.noarch.rpm"
RPM_HASH = "fd34e15b7f1a44f4c73ecc52ceeb77de33703ec2e532a79f0331074765b6c5ffc2d0deee21e6524ebb789a0bf77d718cc26c17f7ef92eb32ac888161fef49caa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-acronym-doc"
RDEPENDS:${PN} += ""

inherit rpm
