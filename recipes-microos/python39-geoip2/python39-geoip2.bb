SUMMARY = "MaxMind GeoIP2 Python API"
DESCRIPTION = "This package provides an API for the GeoIP2 web services and databases. \
The API also works with MaxMind's free GeoLite2 databases."
LICENSE = "Apache-2.0"

PV = "4.6.0"

RPM_NAME = "python39-geoip2-4.6.0-3.2.noarch.rpm"
RPM_HASH = "d24abc6490d2e96b4e738dc4932738277f598295fba8cbacc3db3fac38fe592fd2152904fd60a0ad2859174a5177b5cc130aa5ba8cff9b3bc3cba328799bc7d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(geoip2) python39-geoip2 python3dist(geoip2)"
RDEPENDS:${PN} += "python(abi) python39-maxminddb python39-requests"

inherit rpm
