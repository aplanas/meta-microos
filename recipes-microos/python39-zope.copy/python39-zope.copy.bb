SUMMARY = "Pluggable object copying mechanism"
DESCRIPTION = "This package provides a pluggable mechanism for copying persistent objects. \
 \
Documentation is hosted at https://zopecopy.readthedocs.io/en/latest/"
LICENSE = "ZPL-2.1"

PV = "4.3"

RPM_NAME = "python39-zope.copy-4.3-1.3.noarch.rpm"
RPM_HASH = "e4f8ba56cd50669ccc22faf630def1a757f6c5a82c127306432e8b1dc64a33cb6eed14f1680f413f895a2577027aaf360504924d9d40d7f58245788cd95fbb22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(zope.copy) \
python39-zope.copy \
python3dist(zope.copy)"
RDEPENDS:${PN} += "python(abi) \
python39-zope.interface"

inherit rpm
