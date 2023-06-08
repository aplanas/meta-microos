SUMMARY = "Python charting for 80% of humans"
DESCRIPTION = "Leather is the Python charting library for those who need charts *now* \
and don't care if they're perfect."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python39-leather-0.3.4-1.6.noarch.rpm"
RPM_HASH = "34f8771b9362899d0d35908f343899b83c03bd998494b2afcac006d966a5f21a9b1b8f743c476ada2b297d53c6be795f63de0b7d1c3cdb988eb8462040afdedc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(leather) python39-leather python3dist(leather)"
RDEPENDS:${PN} += "python(abi) python39-six"

inherit rpm
