SUMMARY = "Python ini2toml[all] extra requirement"
DESCRIPTION = "The ini2toml[all] extra requirements for python311-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.11.3"

RPM_NAME = "python311-ini2toml-all-0.11.3-2.1.noarch.rpm"
RPM_HASH = "cf7f893d45fe041ec21198e4c121b1e3c89ecd1ac337f3b5b37a16a2f960aa450e206f21662bf032f98e4e251dd4a7c38638643acaf326895190a973c78d7764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-ini2toml-all"
RDEPENDS:${PN} += "(python311-configupdater >= 3.0.1 with python311-configupdater < 4) (python311-importlib-metadata if python311-base < 3.8) (python311-tomli-w >= 0.4.0 with python311-tomli-w < 2) (python311-tomlkit >= 0.10 with python311-tomlkit < 2) python311-ini2toml"

inherit rpm
