SUMMARY = "Source of XYZ tiles providers"
DESCRIPTION = "xyzservices is a lightweight library providing a repository \
of available XYZ services offering raster basemap tiles. \
The repository is provided via Python API and as a compressed \
JSON file. \
 \
XYZ tiles can be used as background for your maps to provide \
necessary spatial context. xyzservices offer specifications \
of many tile services and provide an easy-to-use tools to \
plug them into your work, no matter if interactive or static."
LICENSE = "BSD-3-Clause"

PV = "2022.9.0"

RPM_NAME = "python310-xyzservices-2022.9.0-1.5.noarch.rpm"
RPM_HASH = "d299b0e03c2f45fcb1594fdfc29f6d062dc06c6296c11ed9b264477f57d3ae94dc7dbfa8bb49c22b2de0c2cb3fe5c8f4edb65f3bbcfa3e81a81a75586c20a500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xyzservices python3.10dist(xyzservices) python310-xyzservices python3dist(xyzservices)"
RDEPENDS:${PN} += "python(abi) xyzservices-data"

inherit rpm
