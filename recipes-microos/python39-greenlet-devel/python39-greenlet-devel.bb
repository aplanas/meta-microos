SUMMARY = "C development headers for python-greenlet"
DESCRIPTION = "This package contains header files required for C modules development."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "python39-greenlet-devel-1.1.3-3.1.noarch.rpm"
RPM_HASH = "53b64033c02b9b593ce26a1c3ef172c4edfe4c6e4b8b7d5bc88bfcc53d4f07193a46da9f1cdeb6e0962c31891a7549335b3df7e5b1b04f039f7c2d6b3e91fc31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-greenlet-devel"
RDEPENDS:${PN} += "python39-greenlet"

inherit rpm
