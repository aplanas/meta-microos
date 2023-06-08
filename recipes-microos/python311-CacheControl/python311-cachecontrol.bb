SUMMARY = "Caching library for Python requests"
DESCRIPTION = "CacheControl is a port of the caching algorithms in httplib2 for use with \
requests session object."
LICENSE = "Apache-2.0"

PV = "0.12.11"

RPM_NAME = "python311-CacheControl-0.12.11-2.1.noarch.rpm"
RPM_HASH = "08c6e7026d8d6a129bfcac6613bc170df06d2d6915f21d627eb5c05d668841ea7553eb0b8608f048b74fce46081600f71af1c2f1c3f890f69f1cf07dfaac5326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cachecontrol) python311-CacheControl python311-cachecontrol python3dist(cachecontrol)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-msgpack python311-requests update-alternatives"

inherit rpm
