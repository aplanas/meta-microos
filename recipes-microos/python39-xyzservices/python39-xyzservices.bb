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

RPM_NAME = "python39-xyzservices-2022.9.0-1.5.noarch.rpm"
RPM_HASH = "84ff5f06d1db87099cec740d7c840714f2d58a5f35757a08ee8d6903a4a338b445eafe1022021220541f0d02ad36cbe2bb404fe9b3e6a2a152ec0f6fd76f8fca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xyzservices) \
python39-xyzservices \
python3dist(xyzservices)"
RDEPENDS:${PN} += "python(abi) \
xyzservices-data"

inherit rpm
