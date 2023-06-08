SUMMARY = "Data files required by all builds of MAME"
DESCRIPTION = "This package contains all data files needed by the MAME binaries: \
 * shaders \
 * artwork \
 * rom hashes \
 * languages"
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.253"

RPM_NAME = "mame-data-0.253-2.1.noarch.rpm"
RPM_HASH = "ad6f9c0e5951abb0d053f5e9fe95730ed6d0db33562716067f5dc4085e28511aa9519b176d9e1f8408c9d7debdd250acd3754fc343cbb90b020b347375aa2888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mame-data"
RDEPENDS:${PN} += ""

inherit rpm
