SUMMARY = "Python ini2toml[full] extra requirement"
DESCRIPTION = "The ini2toml[full] extra requirements for python311-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python311-ini2toml-full-0.12-2.1.noarch.rpm"
RPM_HASH = "d4160562a978c32f0997da217be7c6c46c12b6135cccf63f284494d933606e3bf973cc150e1719e0b234f28cd78bd281dfc9f3a620a32d27376212d8a44ee7df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-ini2toml-full"
RDEPENDS:${PN} += "(python311-configupdater >= 3.0.1 with python311-configupdater < 4) (python311-tomlkit >= 0.10 with python311-tomlkit < 2) python311-ini2toml"

inherit rpm
