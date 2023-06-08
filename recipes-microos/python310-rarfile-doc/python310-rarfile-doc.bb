SUMMARY = "RAR Archive Reader for Python (Documentation)"
DESCRIPTION = "Python module for RAR archive reading. \
 \
This package contains technical documentation."
LICENSE = "ISC"

PV = "4.0"

RPM_NAME = "python310-rarfile-doc-4.0-3.5.noarch.rpm"
RPM_HASH = "e2acfd4de9e3808ac09114988a4f528afae22f51ef16bab56006ddeb4ca39edd4810e8c8145b3abfeb9b7062376ad16c7402e6915dae8c6971910794c2cd6fba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rarfile-doc python310-rarfile-doc"
RDEPENDS:${PN} += ""

inherit rpm
