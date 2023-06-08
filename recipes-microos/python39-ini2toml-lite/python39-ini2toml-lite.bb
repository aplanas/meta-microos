SUMMARY = "Python ini2toml[lite] extra requirement"
DESCRIPTION = "The ini2toml[lite] extra requirements for python39-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.11.3"

RPM_NAME = "python39-ini2toml-lite-0.11.3-2.1.noarch.rpm"
RPM_HASH = "6b5542af7c057f48682a4cc51451862ca226ea1ed33850f059c2a940609b12dc2c9f5f1ee46053132d883ce14b07e4b0b55bd06f5713bb4f582cb82eafa759a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-ini2toml-lite"
RDEPENDS:${PN} += "(python39-importlib-metadata if python39-base < 3.8) (python39-tomli-w >= 0.4.0 with python39-tomli-w < 2) python39-ini2toml"

inherit rpm
