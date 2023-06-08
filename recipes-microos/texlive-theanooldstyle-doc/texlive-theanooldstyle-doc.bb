SUMMARY = "Documentation for texlive-theanooldstyle"
DESCRIPTION = "This package includes the documentation for texlive-theanooldstyle"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64519"

RPM_NAME = "texlive-theanooldstyle-doc-2023.201.svn64519-54.1.noarch.rpm"
RPM_HASH = "dd0288d87e239174bc576a17ec770d4810471deb2c4fe31e47dcb289b8af82aad47277a566b6ecd5dad29b3f23c2e39b61733959865822e451763c447e006eee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-theanooldstyle-doc"
RDEPENDS:${PN} += ""

inherit rpm
