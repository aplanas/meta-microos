SUMMARY = "Unbearably fast runtime type checking in pure Python"
DESCRIPTION = "Unbearably fast runtime type checking in pure Python."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python311-beartype-0.14.0-1.1.noarch.rpm"
RPM_HASH = "2192816954edb9d3877acb257b32668bcbd559b3fa4f88348c1179b9accf9eb80cf293e67ae908f6ddebc01e6718812faf9ff3fcea33692a629d447b93352264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(beartype) \
python311-beartype \
python3dist(beartype)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
