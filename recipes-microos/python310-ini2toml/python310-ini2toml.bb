SUMMARY = "Automatic conversion of .ini/cfg files to TOML equivalents"
DESCRIPTION = "The original purpose of this project is to help migrating setup.cfg files \
to PEP 621, but by extension it can also be used to convert any compatible ini_cfg \
file to TOML."
LICENSE = "MPL-2.0"

PV = "0.11.3"

RPM_NAME = "python310-ini2toml-0.11.3-2.1.noarch.rpm"
RPM_HASH = "e57774b7ee4b15fbb5c6ddd7a7645a02bd5de4d275f6bd1f00893b3373f3d131b09ba13ef18ff1854b6aa8563b9063cbad159c55ae630d37a2f6415b9b94032a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ini2toml python3.10dist(ini2toml) python310-ini2toml python3dist(ini2toml)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-packaging update-alternatives"

inherit rpm
