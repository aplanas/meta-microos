SUMMARY = "Documentation of libqxp API"
DESCRIPTION = "The libqxp-doc package contains documentation files for libqxp."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libqxp-doc-0.0.2-1.19.noarch.rpm"
RPM_HASH = "904fd5b34f25cc40559fda2c1cd8bbf56bd255eef41a672a2dfb13d3489576f04b31ebae24d05ba65665e66f7a039ee3a1c2b0bd756541cb0a4c9e19ba370cc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqxp-doc"
RDEPENDS:${PN} += ""

inherit rpm
