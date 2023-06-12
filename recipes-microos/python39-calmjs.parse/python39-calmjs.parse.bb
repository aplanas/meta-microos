SUMMARY = "Various parsers for ECMA standards"
DESCRIPTION = "A collection of parsers and helper libraries for understanding \
ECMAScript; a near feature complete fork of slimit."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-calmjs.parse-1.3.0-2.10.noarch.rpm"
RPM_HASH = "bf2c57bd5f4402372fff7c0f2c2ff365f18272b11718ebf84c5f18b189b6ab4194231514c58415a842c7adee053043f21a5f3be74ce855d21463a40e6eb19acc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(calmjs.parse) \
python39-calmjs.parse \
python3dist(calmjs.parse)"
RDEPENDS:${PN} += "python(abi) \
python39-ply \
python39-setuptools"

inherit rpm
