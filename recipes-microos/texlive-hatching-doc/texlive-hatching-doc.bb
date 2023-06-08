SUMMARY = "Documentation for texlive-hatching"
DESCRIPTION = "This package includes the documentation for texlive-hatching"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.11svn23818"

RPM_NAME = "texlive-hatching-doc-2023.201.0.0.11svn23818-53.1.noarch.rpm"
RPM_HASH = "63c422c0fc99aa0246406db64fecc6d6a70bb76427154ceff7f5fb87c1d169f058528caa484776f77c9f056bd631b3cba0606c7af0fc7fd3e52f76a9379b441e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hatching-doc"
RDEPENDS:${PN} += ""

inherit rpm
