SUMMARY = "Documentation for texlive-tensind"
DESCRIPTION = "This package includes the documentation for texlive-tensind"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn51481"

RPM_NAME = "texlive-tensind-doc-2023.201.1.1svn51481-54.1.noarch.rpm"
RPM_HASH = "4047e9940f10972d92413cf85123bdda188c03cf3ed28e60664957ee0c908b7e149323006b255ea2bdf2379ebce43f4037faea0b54656c2222b2be88df24d045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tensind-doc"
RDEPENDS:${PN} += ""

inherit rpm
