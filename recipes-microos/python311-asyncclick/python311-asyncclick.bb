SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "AsyncClick ist a fork of Click that works well with trio or asyncio. \
 \
Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.3.4"

RPM_NAME = "python311-asyncclick-8.1.3.4-1.3.noarch.rpm"
RPM_HASH = "8fa89e5e374b729ba47f82e1bc9be0531a9f77682d15a0710513cc0061a4c0c3936e4d76717662f18a56d5e0c478794332a954964066b3ca10906c4f6841331f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asyncclick) python311-asyncclick python3dist(asyncclick)"
RDEPENDS:${PN} += "python(abi) python311-setuptools"

inherit rpm
