SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "AsyncClick ist a fork of Click that works well with trio or asyncio. \
 \
Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.3.4"

RPM_NAME = "python39-asyncclick-8.1.3.4-2.1.noarch.rpm"
RPM_HASH = "6aef2000680e7580be892784b1a998f44ade73dc499dcd1b64994f6d9e124504808936d514c262cc7435cc967f31030eb87fa74086b07558aa62452c62d8f6a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(asyncclick) \
python39-asyncclick \
python3dist(asyncclick)"
RDEPENDS:${PN} += "python(abi) \
python39-setuptools"

inherit rpm
