SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.10.3"

RPM_NAME = "python311-fakeredis-2.10.3-2.1.noarch.rpm"
RPM_HASH = "2f9359d824e4db5bef4e8149b63b20907d58686e7de8b6755580ab2aa5660ec30964a3ccf5b4e5730eb256b6faf65efb9ad594e944e26ab985f74b7046c90a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fakeredis) python311-fakeredis python3dist(fakeredis)"
RDEPENDS:${PN} += "python(abi) python311-redis python311-sortedcontainers"

inherit rpm
