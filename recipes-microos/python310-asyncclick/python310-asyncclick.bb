SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "AsyncClick ist a fork of Click that works well with trio or asyncio. \
 \
Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.3.4"

RPM_NAME = "python310-asyncclick-8.1.3.4-1.3.noarch.rpm"
RPM_HASH = "6ba0cb1a36b4f1dbaf4f9122fca61a00e683fb73db5babc15d173d5c6a158836e0e2413e517bf94dfb3926de03ec44a7dc1d360cc2e30d8ef9701f07df8ed66d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asyncclick python3.10dist(asyncclick) python310-asyncclick python3dist(asyncclick)"
RDEPENDS:${PN} += "python(abi) python310-setuptools"

inherit rpm
