SUMMARY = "Automatic conversion of .ini/cfg files to TOML equivalents"
DESCRIPTION = "The original purpose of this project is to help migrating setup.cfg files \
to PEP 621, but by extension it can also be used to convert any compatible ini_cfg \
file to TOML."
LICENSE = "MPL-2.0"

PV = "0.11.3"

RPM_NAME = "python39-ini2toml-0.11.3-2.1.noarch.rpm"
RPM_HASH = "01ab25a09d4dedd51aaed5809a31a996e07f2de1b52c788fb563c9f88fff421c3ff68718e373e36084ec86b55b9bb1568259a1a7c00d6fb201776b581396a709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ini2toml) python39-ini2toml python3dist(ini2toml)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-packaging update-alternatives"

inherit rpm
