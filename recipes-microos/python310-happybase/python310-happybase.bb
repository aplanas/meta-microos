SUMMARY = "A Python library to interact with Apache HBase"
DESCRIPTION = "HappyBase is a Python library to interact with Apache HBase."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-happybase-1.2.0-3.7.noarch.rpm"
RPM_HASH = "4c7bc87fc931c3abc466e2a628ec5c2c03fe016d03cc637ff1e8f2242532323064d3bd90448fad9deee9397d1536c319294eebf74d682d389640fd4433a9d456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-happybase \
python3.10dist(happybase) \
python310-happybase \
python3dist(happybase)"
RDEPENDS:${PN} += "python(abi) \
python310-six \
python310-thriftpy2"

inherit rpm
