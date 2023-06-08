SUMMARY = "Client library for DQSegDB"
DESCRIPTION = "python-dqsegdb provides the python bindings and the client tools to \
connect to LIGO/VIRGO DQSEGDB server instances."
LICENSE = "GPL-3.0-only"

PV = "2.0.0"

RPM_NAME = "python38-dqsegdb-2.0.0-2.4.noarch.rpm"
RPM_HASH = "a44f6d15d64708afe7c891f04c723fa4e6ee5d9f27c6d6f20d5ff11ac96a21cd9e0673bb05e0ef5948b600a3a08ccc01af5385ae47af228f446271fa450a57c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(dqsegdb) python38-dqsegdb python3dist(dqsegdb)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.8 python(abi) python38-gwdatafind python38-lal python38-lscsoft-glue python38-numpy python38-pyOpenSSL python38-pyRXP update-alternatives"

inherit rpm
