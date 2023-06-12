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

RPM_NAME = "python311-itsdangerous-2.1.2-2.1.noarch.rpm"
RPM_HASH = "b69168da681c3a6ca83e995db109f209b3b0e8b670a43b909607817b0e5707e1ca5fdb271d813c4c8baf890f19085341e402e9d593c20529f59682967f002a0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(itsdangerous) \
python311-itsdangerous \
python3dist(itsdangerous)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
