SUMMARY = "Python module for interacting with nested dicts"
DESCRIPTION = "Python module for interacting with nested dicts as a single level dict with delimited keys."
LICENSE = "BSD-3-Clause"

PV = "4.0.1"

RPM_NAME = "python310-flatdict-4.0.1-3.6.noarch.rpm"
RPM_HASH = "f1d6ed1a1edd99e244920afcb2c62ac1937fded26c5cec11903db23693aac7dba5f9f1d38af0f1eea4956748f310fee3554bf08e83d5da24e99e33d58e7d7175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flatdict python3.10dist(flatdict) python310-flatdict python3dist(flatdict)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
