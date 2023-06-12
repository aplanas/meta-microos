SUMMARY = "Automatic conversion of .ini/cfg files to TOML equivalents"
DESCRIPTION = "The original purpose of this project is to help migrating setup.cfg files \
to PEP 621, but by extension it can also be used to convert any compatible ini_cfg \
file to TOML."
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python39-ini2toml-0.12-2.1.noarch.rpm"
RPM_HASH = "013de347439f91af6fb2df1993799307def1461cbd7e3c4c123d3dcdceddee1252f0743e0369c24c66de894860636bc8921b35ed3f9fd984845d790a7afab84d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ini2toml) python39-ini2toml python3dist(ini2toml)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-packaging update-alternatives"

inherit rpm
