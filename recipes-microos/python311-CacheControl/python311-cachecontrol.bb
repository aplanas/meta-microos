SUMMARY = "Caching library for Python requests"
DESCRIPTION = "CacheControl is a port of the caching algorithms in httplib2 for use with \
requests session object."
LICENSE = "Apache-2.0"

PV = "0.12.11"

RPM_NAME = "python311-CacheControl-0.12.11-3.1.noarch.rpm"
RPM_HASH = "3f5944029958e701cf86b4fa0c55281d606615dac24712a5f374d360b1fb6523e56b813e1e77c038f5d1ad3b2265458f7f2ede6bfa080a646e7a593d301e4b15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cachecontrol) python311-CacheControl python311-cachecontrol python3dist(cachecontrol)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-msgpack python311-requests update-alternatives"

inherit rpm
