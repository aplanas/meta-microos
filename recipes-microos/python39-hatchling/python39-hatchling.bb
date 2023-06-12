SUMMARY = "Build backend used by Hatch"
DESCRIPTION = "This is the extensible, standards compliant build backend used by Hatch."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "python39-hatchling-1.17.0-1.1.noarch.rpm"
RPM_HASH = "7903341887c379553c71fa2133d7ee9d02793dde8070b7cb1dfd76a42050414621b61c8a371403fbb2edf04d83398fbd315ea12a0dfb2078580336b3cc045234"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hatchling) \
python39-hatchling \
python3dist(hatchling)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-editables \
python39-packaging \
python39-pathspec \
python39-pluggy \
python39-tomli \
python39-trove-classifiers \
update-alternatives"

inherit rpm
