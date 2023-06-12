SUMMARY = "A Python framework for working with the Node.js ecosystem"
DESCRIPTION = "A Python framework for building toolchains and utilities for working \
with the Node.js ecosystem from within a Python environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.4"

RPM_NAME = "python39-calmjs-3.4.4-1.1.noarch.rpm"
RPM_HASH = "c255736d7cacec9f9cb3dcd7816ef16ae50775b5ac84d6cca80e9ecc5003d09869d36aef8b11c630b8b59a4af855f915a2eb77dbcf210bd09a312cd419570079"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(calmjs) \
python39-calmjs \
python3dist(calmjs)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-calmjs.parse \
python39-calmjs.types \
update-alternatives"

inherit rpm
