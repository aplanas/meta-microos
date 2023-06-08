SUMMARY = "A GSSAPI authentication handler for python-requests"
DESCRIPTION = "A GSSAPI authentication handler for python-requests"
LICENSE = "ISC"

PV = "1.2.3"

RPM_NAME = "python310-requests-gssapi-1.2.3-1.6.noarch.rpm"
RPM_HASH = "e0a7f4640f13ab88537d18fc5e47ab39d6c633fc4170ce718f3ba8a34cf5b5f51ba1af0d93c59c75728a27b874ec0a3505b50b419a4591d8da0274570ef65111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-gssapi python3.10dist(requests-gssapi) python310-requests-gssapi python3dist(requests-gssapi)"
RDEPENDS:${PN} += "python(abi) python310-gssapi python310-requests"

inherit rpm
