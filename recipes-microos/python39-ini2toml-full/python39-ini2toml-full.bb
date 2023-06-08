SUMMARY = "Python ini2toml[full] extra requirement"
DESCRIPTION = "The ini2toml[full] extra requirements for python39-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.11.3"

RPM_NAME = "python39-ini2toml-full-0.11.3-2.1.noarch.rpm"
RPM_HASH = "e368ee78a6148428315ef1b49d6e08132a81ad85fd97bcafe7faee341b0387fc347de9b2a7dfc6aa39b0f74dc705e3ad021736c41eb4cf3079b5991366e0c940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-ini2toml-full"
RDEPENDS:${PN} += "(python39-configupdater >= 3.0.1 with python39-configupdater < 4) (python39-tomlkit >= 0.10 with python39-tomlkit < 2) python39-ini2toml"

inherit rpm
