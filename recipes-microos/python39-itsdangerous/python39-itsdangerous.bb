SUMMARY = "Various helpers to pass trusted data to untrusted environments and back"
DESCRIPTION = "It's Dangerous \
   ... so better sign this \
 \
Various helpers to pass data to untrusted environments and to get it back \
safe and sound. \
 \
This repository provides a module that is a port of the django signing \
module.  It's not directly copied but some changes were applied to \
make it work better on its own. \
 \
Also I plan to add some extra things.  Work in progress."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "python39-itsdangerous-2.1.2-2.1.noarch.rpm"
RPM_HASH = "3a0869e313551cc5e71a2bf9c0c4740445144f71f95fec53c53c504863958ecfadd9438c0348abf463f4370002fd8e3ef09a1423d65c970a8123b12430c3ca71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(itsdangerous) python39-itsdangerous python3dist(itsdangerous)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
