SUMMARY = "Documentation for texlive-doi"
DESCRIPTION = "This package includes the documentation for texlive-doi"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn48634"

RPM_NAME = "texlive-doi-doc-2023.201.svn48634-52.1.noarch.rpm"
RPM_HASH = "61c525bb82cadfb809b3e19baad7d723054f646dd11a7e678bdd1869e0644a5b6d0874676bf58441599d99fcd6f41dfda8164c89ac9f3c3199c6e52cddd27a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doi-doc"
RDEPENDS:${PN} += ""

inherit rpm
