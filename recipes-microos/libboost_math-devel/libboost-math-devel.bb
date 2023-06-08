SUMMARY = "Development headers for Boost.Math libraries"
DESCRIPTION = "Development headers for Boost.Math* boost libraries. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_math-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "2da3f70e242c847f403ed77127acdae84566ae08c270a1ebe250a6da99a1a513cce53917e6b34a3c41e0d95dde88bd3188601b7c64994cbb5eacc204921ffcd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_math-devel"
RDEPENDS:${PN} += "libboost_math1_82_0-devel"

inherit rpm
