SUMMARY = "Documentation for texlive-toptesi"
DESCRIPTION = "This package includes the documentation for texlive-toptesi"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.4.06svn56276"

RPM_NAME = "texlive-toptesi-doc-2023.201.6.4.06svn56276-52.1.noarch.rpm"
RPM_HASH = "2718abbfd57d029fbd2f2ab6d61ba49cba54887cba753cdcf1475339443de95eac1ed3ea328096cc1e430ce90fdc7b73a092d4b1a6dd60a457fd3d51fbc0da70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-toptesi-doc:en;it) texlive-toptesi-doc"
RDEPENDS:${PN} += ""

inherit rpm
