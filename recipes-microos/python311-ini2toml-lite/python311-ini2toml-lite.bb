SUMMARY = "Python ini2toml[lite] extra requirement"
DESCRIPTION = "The ini2toml[lite] extra requirements for python311-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.11.3"

RPM_NAME = "python311-ini2toml-lite-0.11.3-2.1.noarch.rpm"
RPM_HASH = "c264945637187f21d048600ce154b31748da6021c8afc5d28e666a0031c5b45a4e623880035d9e6d039534749c67fcf45309ea51d077d46584c5d799af7a534a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-ini2toml-lite"
RDEPENDS:${PN} += "(python311-importlib-metadata if python311-base < 3.8) (python311-tomli-w >= 0.4.0 with python311-tomli-w < 2) python311-ini2toml"

inherit rpm
