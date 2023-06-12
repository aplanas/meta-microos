SUMMARY = "Python library for building OAuth and OpenID Connect servers"
DESCRIPTION = "A Python library for building OAuth and OpenID Connect servers."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python39-Authlib-1.2.0-1.3.noarch.rpm"
RPM_HASH = "fbcdc717d9ec669ce5aeedd4d951c0a45ca516db1890e260a244093c8225b4feca2a97cb212a154402bde329789aff3883f9e8750fb657732b7478a415251adf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(authlib) \
python39-Authlib \
python3dist(authlib)"
RDEPENDS:${PN} += "python(abi) \
python39-cryptography"

inherit rpm
