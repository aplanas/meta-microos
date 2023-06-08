SUMMARY = "Python ini2toml[full] extra requirement"
DESCRIPTION = "The ini2toml[full] extra requirements for python311-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.11.3"

RPM_NAME = "python311-ini2toml-full-0.11.3-2.1.noarch.rpm"
RPM_HASH = "4ecd5b9776af8f7d320d6e02098024564a710058fe13aa5e92d780e6240586e64413f02b52a2020fe5b4147048f8c6ca3c23fded37740848e5844c8b5915a26d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-ini2toml-full"
RDEPENDS:${PN} += "(python311-configupdater >= 3.0.1 with python311-configupdater < 4) (python311-tomlkit >= 0.10 with python311-tomlkit < 2) python311-ini2toml"

inherit rpm
