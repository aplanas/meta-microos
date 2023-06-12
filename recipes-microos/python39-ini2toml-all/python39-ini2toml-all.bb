SUMMARY = "Python ini2toml[all] extra requirement"
DESCRIPTION = "The ini2toml[all] extra requirements for python39-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python39-ini2toml-all-0.12-2.1.noarch.rpm"
RPM_HASH = "52617ccd5fdd9c012ee0b21b47057dbac85fc973a607d07d0145eefbb73795b2cdbb3d9ff5292fbec8d20e98786c27880883f91c60db27b22d1da0182b9c0fac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-ini2toml-all"
RDEPENDS:${PN} += "(python39-configupdater >= 3.0.1 with python39-configupdater < 4) (python39-importlib-metadata if python39-base < 3.8) (python39-tomli-w >= 0.4.0 with python39-tomli-w < 2) (python39-tomlkit >= 0.10 with python39-tomlkit < 2) python39-ini2toml"

inherit rpm
