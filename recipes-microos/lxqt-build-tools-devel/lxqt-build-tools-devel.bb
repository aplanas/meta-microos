SUMMARY = "Tools for building lxqt"
DESCRIPTION = "This package provides several tools needed to build LXQt itself as well as other components maintained by the LXQt project. \
 \
These tools used to be spread over the repositories of various other components and were summarized to ease dependency management. So far many components, in particular [liblxqt](https://github.com/lxde/liblxqt), were representing a build dependency without being needed themselves but only because their repository was providing a subset of the tools which are now summarized here. So the use of this repository will reduce superfluous and bloated dependencies."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "lxqt-build-tools-devel-0.13.0-1.1.noarch.rpm"
RPM_HASH = "fd24b46af80b650c13e6ff0fe39c02624e14009915b72447d9928d8da1660d4bd9b01ed65cf12f1991715a4d8315571a563a7244489598afd6936d28e7be54da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake(lxqt-build-tools) lxqt-build-tools-devel"
RDEPENDS:${PN} += "/bin/sh pkgconfig pkgconfig(Qt5Core)"

inherit rpm
