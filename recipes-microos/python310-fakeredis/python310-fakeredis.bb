SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.10.3"

RPM_NAME = "python310-fakeredis-2.10.3-2.1.noarch.rpm"
RPM_HASH = "133b2891a89bd392bd364e8e0cde702e4e5ca3299868835767d58b99dc53ac52d1941d26beafae017f400226036b1dc4095353ccfece064927070a3c23a0dda1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fakeredis python3.10dist(fakeredis) python310-fakeredis python3dist(fakeredis)"
RDEPENDS:${PN} += "python(abi) python310-redis python310-sortedcontainers"

inherit rpm
