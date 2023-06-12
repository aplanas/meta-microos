SUMMARY = "Python ini2toml[full] extra requirement"
DESCRIPTION = "The ini2toml[full] extra requirements for python39-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python39-ini2toml-full-0.12-2.1.noarch.rpm"
RPM_HASH = "461e0e4e99d8dc7e940f18b1cbbde94ad69441d8c3b8f14b1c7baa17b2ff0622fb9916e5105f0d73df54d17fbbd111dd510fa1016fb0314fa954a3088c2efff7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-ini2toml-full"
RDEPENDS:${PN} += "(python39-configupdater >= 3.0.1 with python39-configupdater < 4) \
(python39-tomlkit >= 0.10 with python39-tomlkit < 2) \
python39-ini2toml"

inherit rpm
