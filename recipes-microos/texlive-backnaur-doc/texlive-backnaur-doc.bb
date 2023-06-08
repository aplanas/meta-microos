SUMMARY = "Documentation for texlive-backnaur"
DESCRIPTION = "This package includes the documentation for texlive-backnaur"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn54080"

RPM_NAME = "texlive-backnaur-doc-2023.201.3.1svn54080-53.1.noarch.rpm"
RPM_HASH = "43f76294c2794238070853f8b0a8021811be1a9f100aef6730b360cbc0eb298cd87e2a75582dbcec69ca47531e31b25083d6c7852e14737ce25ba83894631121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-backnaur-doc"
RDEPENDS:${PN} += ""

inherit rpm
