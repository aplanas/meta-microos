SUMMARY = "Python Left-Right Parser"
DESCRIPTION = "Python Left-Right Parser."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "python310-pyleri-1.3.3-1.8.noarch.rpm"
RPM_HASH = "40cf1ecc3c812c91962e0dfa50d4a87c5174bb0044f2bc3ee7d4c76dcbb07156f7b90d350fdbf0e315b86d2d7fe01411791c7d54f858bee8eb639d5372f4da40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyleri python3.10dist(pyleri) python310-pyleri python3dist(pyleri)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
