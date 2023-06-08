SUMMARY = "GPX file parser and GPS track manipulation library"
DESCRIPTION = "A Python library for parsing and manipulating GPX files. \
GPX is an XML based format for GPS tracks."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python310-gpxpy-1.5.0-1.4.noarch.rpm"
RPM_HASH = "3d5ec291544cad87113b8d76db2c9a26c60604eda3f59567e9df808867b28f1d0e27f2ba5a03d2d60965de9e8ede44dce5442af392f9d58cec5e7285b8a0c2eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gpxpy python3.10dist(gpxpy) python310-gpxpy python3dist(gpxpy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
