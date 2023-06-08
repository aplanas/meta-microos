SUMMARY = "Documentation for texlive-ethiop-t1"
DESCRIPTION = "This package includes the documentation for texlive-ethiop-t1"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-ethiop-t1-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "a848bb564a2243011e4820bb839ff54f0a1dc9097456e51a83e4b60bf15ec218be912d15a7ca868b29e016cc36bebef487e0822b53583bd57a664809e216111f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ethiop-t1-doc"
RDEPENDS:${PN} += ""

inherit rpm
