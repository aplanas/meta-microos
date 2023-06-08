SUMMARY = "Client library for DQSegDB"
DESCRIPTION = "python-dqsegdb provides the python bindings and the client tools to \
connect to LIGO/VIRGO DQSEGDB server instances."
LICENSE = "GPL-3.0-only"

PV = "2.0.0"

RPM_NAME = "python310-dqsegdb-2.0.0-2.4.noarch.rpm"
RPM_HASH = "406df1bb58159fea6b7e7ea9709518e8ccaa3733b694848ee127ca2680dece1b310c8d181e36bfa74c3bdfcb28fbcefa2e02b85579e10e31b3185f9891d1ceec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dqsegdb python3.10dist(dqsegdb) python310-dqsegdb python3dist(dqsegdb)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-gwdatafind python310-lal python310-lscsoft-glue python310-numpy python310-pyOpenSSL python310-pyRXP update-alternatives"

inherit rpm
