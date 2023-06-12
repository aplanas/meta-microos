SUMMARY = "Various parsers for ECMA standards"
DESCRIPTION = "A collection of parsers and helper libraries for understanding \
ECMAScript; a near feature complete fork of slimit."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-calmjs.parse-1.3.0-2.10.noarch.rpm"
RPM_HASH = "487884729ff1fc418cdae4b4302501e39d960e6d0fa789547ff7fcbef9f2baf4e09ffc49cb8b3d62d4394690c8614a5f86c55d8f8c296aaee3ac8c098548d2d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(calmjs.parse) \
python311-calmjs.parse \
python3dist(calmjs.parse)"
RDEPENDS:${PN} += "python(abi) \
python311-ply \
python311-setuptools"

inherit rpm
