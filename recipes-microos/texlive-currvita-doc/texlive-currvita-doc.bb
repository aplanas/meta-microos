SUMMARY = "Documentation for texlive-currvita"
DESCRIPTION = "This package includes the documentation for texlive-currvita"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn15878"

RPM_NAME = "texlive-currvita-doc-2023.204.svn15878-54.1.noarch.rpm"
RPM_HASH = "e7c1a5762d47a2eda73fbfea46a93fd88c060ef22028e8c125baabfbc5eb3bd4685b792464abd8c9452108a2eb3ec93d0c9573b989ac419bb7d23296bee23952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-currvita-doc"
RDEPENDS:${PN} += ""

inherit rpm
