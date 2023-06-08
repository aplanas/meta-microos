SUMMARY = "Python ini2toml[lite] extra requirement"
DESCRIPTION = "The ini2toml[lite] extra requirements for python310-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.11.3"

RPM_NAME = "python310-ini2toml-lite-0.11.3-2.1.noarch.rpm"
RPM_HASH = "92868717c3d1d7027cd1b0d11f2f0d8ac8b4ff8aa30a042bfc0d3ba267c4007ea7c905e8ab7e8db5b5a091e4e7e1e9620fdf8866ae2b241f77b3155bb02ee206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ini2toml-lite python310-ini2toml-lite"
RDEPENDS:${PN} += "(python310-importlib-metadata if python310-base < 3.8) (python310-tomli-w >= 0.4.0 with python310-tomli-w < 2) python310-ini2toml"

inherit rpm
