SUMMARY = "Structured Configuration Library"
DESCRIPTION = "This package contains documentation files for python310-ZConfig."
LICENSE = "ZPL-2.1"

PV = "3.6.1"

RPM_NAME = "python310-ZConfig-doc-3.6.1-1.3.noarch.rpm"
RPM_HASH = "c01f5828da4e33f0780804fc3c9e159c1cf2a46553c9586b9ec3782753d4165a4ce9f0ed5490d540debaa1d5aab6e3d165be96927b0485fa4ed9780dbd3370d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ZConfig-doc \
python310-ZConfig-doc"
RDEPENDS:${PN} += "python310-ZConfig"

inherit rpm
