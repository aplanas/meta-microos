SUMMARY = "Development files for NUnit"
DESCRIPTION = "This package contains development files for NUnit integration."
LICENSE = "MIT"

PV = "3.7.1"

RPM_NAME = "nunit3-devel-3.7.1-1.7.noarch.rpm"
RPM_HASH = "44fefa6aa63fe8b47a88e05ea99c083d0e6c6d783e12fea360c4b9d2339d567f1f6245c3cff4e0447666aa7d4c59016fc7c06839f06342d1cd583b3ade11f6fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nunit3-devel \
pkgconfig(nunit)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
nunit3"

inherit rpm
