SUMMARY = "A tool for discovering and downloading publicly available satellite imagery"
DESCRIPTION = "Sat-search is a Python 3 library and a command line tool for discovering \
and downloading publicly available satellite imagery using a conformant \
API such as sat-api."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-sat-search-0.3.0-1.4.noarch.rpm"
RPM_HASH = "997c90770f138c374856c324e0048649524c5389ccc5ea116e190638cbbc26a789d99ad1c3c0cfababa110c92f8135d8b669e860eb76bb0f83d242cb093e3da6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sat-search) python311-sat-search python3dist(sat-search)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-sat-stac update-alternatives"

inherit rpm
