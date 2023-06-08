SUMMARY = "Python ini2toml[full] extra requirement"
DESCRIPTION = "The ini2toml[full] extra requirements for python310-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.11.3"

RPM_NAME = "python310-ini2toml-full-0.11.3-2.1.noarch.rpm"
RPM_HASH = "8871f9d63fa67bb74589e4b4b31d92d4155e9f93bad2c49ddb57c9a253caffeea4e56628ff13a98d1696c4be11092b76613b976a01eace863f165f93090c8509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ini2toml-full python310-ini2toml-full"
RDEPENDS:${PN} += "(python310-configupdater >= 3.0.1 with python310-configupdater < 4) (python310-tomlkit >= 0.10 with python310-tomlkit < 2) python310-ini2toml"

inherit rpm
