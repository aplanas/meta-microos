SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "AsyncClick ist a fork of Click that works well with trio or asyncio. \
 \
Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.3.4"

RPM_NAME = "python39-asyncclick-8.1.3.4-1.3.noarch.rpm"
RPM_HASH = "27a318f17bd9f40f0e14269b40814e3c06401d03396177aa4f44849393d783b02ffbf8adad8cf6b6ab4fd72b06a5462e7caa381480a02b4d456d620d5ee632e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(asyncclick) python39-asyncclick python3dist(asyncclick)"
RDEPENDS:${PN} += "python(abi) python39-setuptools"

inherit rpm
