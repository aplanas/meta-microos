SUMMARY = "A Simple KML creator"
DESCRIPTION = "The python package simplekml was created to generate kml (or kmz). \
It was designed to alleviate the burden of having to study KML in order to \
achieve anything worthwhile with it. \
If you have a simple understanding of the structure of KML, then simplekml \
is easy to run with and create usable KML."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.6"

RPM_NAME = "python39-simplekml-1.3.6-1.3.noarch.rpm"
RPM_HASH = "64ce112429d01f6f2828f5338b08d2a46e93f3b2d8c222f83aac91ba7412b8b9dd13320f121535cbe335325f93972f138ee2b9eff50437618c425838123e0795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(simplekml) python39-simplekml python3dist(simplekml)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
