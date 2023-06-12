SUMMARY = "Extend python requests with exponential back-off retry"
DESCRIPTION = "A Python library for HTTP requests using requests package with \
exponential back-off retry."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-retryrequests-0.2.0-1.3.noarch.rpm"
RPM_HASH = "2af0add25525458e00d15d07cbb48a21ae8d324a0e3de6461393a24a4dc15a178ff868dba71e7a20c0574256b878f711edf65820133267ac22c768a31e995516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(retryrequests) \
python39-retryrequests \
python3dist(retryrequests)"
RDEPENDS:${PN} += "python(abi) \
python39-requests \
python39-setuptools"

inherit rpm
