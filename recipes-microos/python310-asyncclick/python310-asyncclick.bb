SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "AsyncClick ist a fork of Click that works well with trio or asyncio. \
 \
Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.3.4"

RPM_NAME = "python310-asyncclick-8.1.3.4-2.1.noarch.rpm"
RPM_HASH = "a20823137cce5680b976bed1ee8e186511c7552bd5055540bffb0500b403f0e947a8b2fa6def026e4cf3a4d6296bf318150304d822481ebc73a2f6798d183cc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asyncclick python3.10dist(asyncclick) python310-asyncclick python3dist(asyncclick)"
RDEPENDS:${PN} += "python(abi) python310-setuptools"

inherit rpm
