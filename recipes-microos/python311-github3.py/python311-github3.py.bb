SUMMARY = "Python wrapper for the GitHub API"
DESCRIPTION = "Github3.py is wrapper for v3 of the GitHub API written in python."
LICENSE = "BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "python311-github3.py-3.2.0-1.5.noarch.rpm"
RPM_HASH = "62b7b4e73884b760be83aaa2ec908c11278e57b778bc72fe24a9f2c91ece916bba0714cdb4f98c0ad9847eca5303c2ca7138c54506f3627fd143deabadf40156"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(github3.py) python311-github3.py python3dist(github3.py)"
RDEPENDS:${PN} += "python(abi) python311-PyJWT python311-jwcrypto python311-python-dateutil python311-requests python311-uritemplate"

inherit rpm
