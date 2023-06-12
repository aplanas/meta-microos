SUMMARY = "Python ini2toml[full] extra requirement"
DESCRIPTION = "The ini2toml[full] extra requirements for python310-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python310-ini2toml-full-0.12-2.1.noarch.rpm"
RPM_HASH = "4966a909e072ec3dcaca21a8b5773d6405ffa0a2df69a5d0bcd38978daca1544eedbdb9defaaa7541f88b62254aba5214165bf7a4a955e7e747f73d3b6c1e2a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ini2toml-full python310-ini2toml-full"
RDEPENDS:${PN} += "(python310-configupdater >= 3.0.1 with python310-configupdater < 4) (python310-tomlkit >= 0.10 with python310-tomlkit < 2) python310-ini2toml"

inherit rpm
