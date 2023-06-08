SUMMARY = "C development headers for python-greenlet"
DESCRIPTION = "This package contains header files required for C modules development."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "python310-greenlet-devel-1.1.3-3.1.noarch.rpm"
RPM_HASH = "7979c3d21f2e79f5fd5275794aa1be39a74ee29c62d807b6acfb46c9f0e675fa0055d1357b0e4487d9df9b3d0cdd38671f03afdd469df5d1cf90a3f318155abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-greenlet-devel python310-greenlet-devel"
RDEPENDS:${PN} += "python310-greenlet"

inherit rpm
