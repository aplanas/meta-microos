SUMMARY = "A deep merge function for Python"
DESCRIPTION = "A deep merge function for Python."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python311-mergedeep-1.3.4-2.8.noarch.rpm"
RPM_HASH = "d08adbcc790f0c1798c41a4289fce2227e95062378238bf1525345150cc196197ff3a97d007b9136f9cd6a94df71aba410945c702dc071623c262f39e004bfbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mergedeep) \
python311-mergedeep \
python3dist(mergedeep)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
