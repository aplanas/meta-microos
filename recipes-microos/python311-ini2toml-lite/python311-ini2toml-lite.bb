SUMMARY = "Python ini2toml[lite] extra requirement"
DESCRIPTION = "The ini2toml[lite] extra requirements for python311-ini2toml"
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python311-ini2toml-lite-0.12-2.1.noarch.rpm"
RPM_HASH = "125cecc12e827b93818ea24130ab7204ae7ad2f523333aade66be9aced6961f3095a73a470ed6d39b5832c413f99bdbc1d7b9401a52b4edb7012727e9359f17a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-ini2toml-lite"
RDEPENDS:${PN} += "(python311-importlib-metadata if python311-base < 3.8) (python311-tomli-w >= 0.4.0 with python311-tomli-w < 2) python311-ini2toml"

inherit rpm
