SUMMARY = "NetBox API client library"
DESCRIPTION = "Python API client library for NetBox."
LICENSE = "Apache-2.0"

PV = "7.0.1"

RPM_NAME = "python311-pynetbox-7.0.1-1.3.noarch.rpm"
RPM_HASH = "7d6aa8ac8ec026d9d832d0435a7f2200db3171bf543178ba0a9ca7920b00f6407ae9fc868fe7acf0797ede2c0760b9d2e5747f04d8c3576da48a417f61458e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pynetbox) python311-pynetbox python3dist(pynetbox)"
RDEPENDS:${PN} += "python(abi) python311-netaddr python311-requests"

inherit rpm
