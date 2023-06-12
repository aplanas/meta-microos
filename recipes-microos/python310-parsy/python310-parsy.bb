SUMMARY = "Python parser combinators"
DESCRIPTION = "Easy-to-use parser combinators, for parsing in pure Python."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-parsy-1.3.0-1.8.noarch.rpm"
RPM_HASH = "8c99ac4d72f12ee37835d80301ba0f6e777b802ef28f45888c9ef21ae7cbcf55cc94879ffb20a3f6390f49ac04bf705072bf8dc643a33c99340d70b9ea142b2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parsy \
python3.10dist(parsy) \
python310-parsy \
python3dist(parsy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
