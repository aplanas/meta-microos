SUMMARY = "Gray and ITUlab profiles"
DESCRIPTION = "A gray and ITUlab fax ICC profile."
LICENSE = "Zlib"

PV = "1.2"

RPM_NAME = "icc-profiles-oyranos-extra-1.2-16.21.noarch.rpm"
RPM_HASH = "006bd5a2d1727727746974ad448b29efcd8b8d388d8e5af983cc3e80f0ee8fe9e0a69709e5e38d0e1e181d0e6de22a07b5ff83915ca803a08ba815ce74da1461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-oyranos-extra"
RDEPENDS:${PN} += "color-filesystem"

inherit rpm
