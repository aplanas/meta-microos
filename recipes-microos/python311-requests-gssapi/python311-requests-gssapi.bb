SUMMARY = "A GSSAPI authentication handler for python-requests"
DESCRIPTION = "A GSSAPI authentication handler for python-requests"
LICENSE = "ISC"

PV = "1.2.3"

RPM_NAME = "python311-requests-gssapi-1.2.3-1.6.noarch.rpm"
RPM_HASH = "eb90601ac2c3ef844b600f4d4140c34e68c7ff4dbed7ff83ddc9700a72f1a2ea84dc2deccc4e93bd1c467f8a6d44614e061a900e296b51a26752d0811d84505a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(requests-gssapi) python311-requests-gssapi python3dist(requests-gssapi)"
RDEPENDS:${PN} += "python(abi) python311-gssapi python311-requests"

inherit rpm
