SUMMARY = "Python ini2toml[all] extra requirement"
DESCRIPTION = "The ini2toml[all] extra requirements for python310-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.11.3"

RPM_NAME = "python310-ini2toml-all-0.11.3-2.1.noarch.rpm"
RPM_HASH = "90055993f9111e9aed6d6967104219b3218dc4f64ed2b646818a8d08fd66fa56fc068d02b15afad88563e95238d4927fd0a66d0a2e52a056bf691380c06896e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ini2toml-all python310-ini2toml-all"
RDEPENDS:${PN} += "(python310-configupdater >= 3.0.1 with python310-configupdater < 4) (python310-importlib-metadata if python310-base < 3.8) (python310-tomli-w >= 0.4.0 with python310-tomli-w < 2) (python310-tomlkit >= 0.10 with python310-tomlkit < 2) python310-ini2toml"

inherit rpm
