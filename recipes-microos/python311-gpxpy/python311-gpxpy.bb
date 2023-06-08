SUMMARY = "GPX file parser and GPS track manipulation library"
DESCRIPTION = "A Python library for parsing and manipulating GPX files. \
GPX is an XML based format for GPS tracks."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python311-gpxpy-1.5.0-1.4.noarch.rpm"
RPM_HASH = "989782a98f928c9b2fb788ba7b58ceef3689e8cd6b43c69b7534125dcd5da42546d8cf2cad4aef82993c1a31542cf69ae62ede9f2910c8944ea20a3017c4932e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(gpxpy) python311-gpxpy python3dist(gpxpy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
