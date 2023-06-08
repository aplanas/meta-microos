SUMMARY = "Python diff wrapper"
DESCRIPTION = "Python diff wrapper."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-moreorless-0.4.0-1.3.noarch.rpm"
RPM_HASH = "49781456339d2fa66b4da2fbb57b5b52230b9e2ee5bf730b31b692ffa1c89bafc00405d7e9f8cb440e27e024bf154e67ced3a4e7c07b5c09d99bac3ca8c6dc51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(moreorless) python39-moreorless python3dist(moreorless)"
RDEPENDS:${PN} += "python(abi) python39-click python39-volatile"

inherit rpm
