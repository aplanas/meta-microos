SUMMARY = "Fuzzy string matching in python"
DESCRIPTION = "Fuzzy string matching in python"
LICENSE = "GPL-2.0-only"

PV = "0.18.0"

RPM_NAME = "python39-fuzzywuzzy-0.18.0-2.8.noarch.rpm"
RPM_HASH = "a6dcbcc77bda30b93acac4af18567c0c52d71e88fcddeffd8a0f9d0d68f34f5af1229c6bf1d8262d8782cfd76b68ee466767f70ef333747a10cf7e0f17bd16dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fuzzywuzzy) \
python39-fuzzywuzzy \
python3dist(fuzzywuzzy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
