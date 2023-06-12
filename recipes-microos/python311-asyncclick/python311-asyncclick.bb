SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "AsyncClick ist a fork of Click that works well with trio or asyncio. \
 \
Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.3.4"

RPM_NAME = "python311-asyncclick-8.1.3.4-2.1.noarch.rpm"
RPM_HASH = "d49b42c10b1aa1d3d2d4a323a5e021237331980713ffa1b4139b8e19fd55807cfafe5e60b8d4a024f09c1f5445104d9f8479a00864bbc09b4edf36a8910c68f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asyncclick) python311-asyncclick python3dist(asyncclick)"
RDEPENDS:${PN} += "python(abi) python311-setuptools"

inherit rpm
