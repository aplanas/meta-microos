SUMMARY = "Automatic conversion of .ini/cfg files to TOML equivalents"
DESCRIPTION = "The original purpose of this project is to help migrating setup.cfg files \
to PEP 621, but by extension it can also be used to convert any compatible ini_cfg \
file to TOML."
LICENSE = "MPL-2.0"

PV = "0.11.3"

RPM_NAME = "python311-ini2toml-0.11.3-2.1.noarch.rpm"
RPM_HASH = "2671921d454a7eeabef9680e7759a37cd2db99f3b1aacae83455b4d16fad107319dc54cd28aa0d8b04c7ed551300e08a9933cc48aaefe41495fd6ca95819ea14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ini2toml) python311-ini2toml python3dist(ini2toml)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-packaging update-alternatives"

inherit rpm
