SUMMARY = "in-toto is a framework to protect supply chain integrity."
DESCRIPTION = "in-toto provides a framework to protect the integrity of the software supply chain. It does so by verifying that each task in the chain is carried out as planned, by authorized personnel only, and that the product is not tampered with in transit."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "in-toto-1.2.0-1.5.noarch.rpm"
RPM_HASH = "8342816e2a0c74d5fd654ec51d90e60de50dd7bb084860f8f61263cd638063c0ce043b96f377a9b6fa6b37922045db5a739554f2bc3c8524c2403ebdf41bc42d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "in-toto \
python3.10dist(in-toto) \
python3dist(in-toto)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-attrs \
python3-iso8601 \
python3-pathspec \
python3-python-dateutil \
python3-securesystemslib"

inherit rpm
