SUMMARY = "Atomic transactions for TinyDB"
DESCRIPTION = "Atomic transactions for TinyDB."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-tinyrecord-0.2.0-2.7.noarch.rpm"
RPM_HASH = "3e25bfc5946b433daf562157faff0db3db2309b33634dd6f7752f032e0d1e976e62c300d3b95008e57199934590d87ea12482c84d8b734142116fc59699a42af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tinyrecord) \
python39-tinyrecord \
python3dist(tinyrecord)"
RDEPENDS:${PN} += "python(abi) \
python39-tinydb"

inherit rpm
