SUMMARY = "Hypothesis extension for generating filesystem paths"
DESCRIPTION = "Hypothesis extension for generating filesystem paths"
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python310-hypothesis-fspaths-0.1-2.8.noarch.rpm"
RPM_HASH = "8f8a03455ae334d54f536079280cd4c4957b75b27a81ea8ef6fe0feaf7406c709d56bef9c8f57a0d63ef1cfbb7026587a0770de2b39f88c4556b2e5057a5eb19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hypothesis-fspaths python3.10dist(hypothesis-fspaths) python310-hypothesis-fspaths python3dist(hypothesis-fspaths)"
RDEPENDS:${PN} += "python(abi) python310-hypothesis"

inherit rpm
