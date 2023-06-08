SUMMARY = "File support for setuptools declarative setup.cfg"
DESCRIPTION = "File support for setuptools declarative setup.cfg."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python311-setuptools-declarative-requirements-1.2.0-1.10.noarch.rpm"
RPM_HASH = "ab4076db56a3212654cdb2fbd1cf70c171c3967780dc4ec6792591d59460fb754b5d476e4e5ce6d336f94e9b91ad22f3c8beb9653ab8798fe1d525f08fee6708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(setuptools-declarative-requirements) python311-setuptools-declarative-requirements python3dist(setuptools-declarative-requirements)"
RDEPENDS:${PN} += "python(abi) python311-setuptools python311-toml python311-wheel"

inherit rpm
