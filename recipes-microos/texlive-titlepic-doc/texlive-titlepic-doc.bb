SUMMARY = "Documentation for texlive-titlepic"
DESCRIPTION = "This package includes the documentation for texlive-titlepic"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.2svn43497"

RPM_NAME = "texlive-titlepic-doc-2023.201.1.2svn43497-52.1.noarch.rpm"
RPM_HASH = "52646670d2bf8849942362d485cf6cdd5142cbd6136437eda56f324d272263bddc7b357af02af4b802ef38a74c271a1dc188370243ab3d4502e8fd8eeb334842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titlepic-doc"
RDEPENDS:${PN} += ""

inherit rpm
