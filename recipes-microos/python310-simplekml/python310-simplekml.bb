SUMMARY = "A Simple KML creator"
DESCRIPTION = "The python package simplekml was created to generate kml (or kmz). \
It was designed to alleviate the burden of having to study KML in order to \
achieve anything worthwhile with it. \
If you have a simple understanding of the structure of KML, then simplekml \
is easy to run with and create usable KML."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.6"

RPM_NAME = "python310-simplekml-1.3.6-1.3.noarch.rpm"
RPM_HASH = "04a35334166744244d76556f7a9753b360581d8778850e24601631051ee99d4f396558c01c7345207ff5868e4b73eead2f45d8225d18c320a18f6b61eeabfc19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-simplekml \
python3.10dist(simplekml) \
python310-simplekml \
python3dist(simplekml)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
