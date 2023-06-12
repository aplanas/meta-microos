SUMMARY = "The successor to the Python testing framework nose, based on unittest"
DESCRIPTION = "nose2 is the successor to nose. It's unittest with plugins. \
nose2 is a new project and does not support all of the behaviors of nose. \
nose2's purpose is to extend unittest to make testing nicer and easier to understand."
LICENSE = "BSD-2-Clause & Python-2.0"

PV = "0.12.0"

RPM_NAME = "python311-nose2-0.12.0-2.1.noarch.rpm"
RPM_HASH = "7ab2e664788502e068e71bf1a93739007a7312ceb0b50a69cf1497fe6791b2f502ef0ae0811b6c4fb21c1f339cc9d320b0e5d5439f289c24a526828d4cdb8d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(nose2) \
python311-nose2 \
python3dist(nose2)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
