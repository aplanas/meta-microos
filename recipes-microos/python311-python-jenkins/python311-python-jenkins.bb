SUMMARY = "Python bindings for the remote Jenkins API"
DESCRIPTION = "This package provides Python bindings for the Jenkins Remote \
API. It currently supports management of: \
 * Project configuration \
 * Build control \
 * Slave node configuration"
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python311-python-jenkins-1.8.0-1.1.noarch.rpm"
RPM_HASH = "313d8e047afd44c861b0cf4a34208c6ea9a23fccea4d975ea9138131fa63a0840e435585c846cb81f3737d52c5407590d63dc284b4b7734abbba6f9938178b70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-jenkins) python311-jenkins python311-python-jenkins python3dist(python-jenkins)"
RDEPENDS:${PN} += "python(abi) python311-multi_key_dict python311-pbr python311-requests python311-six"

inherit rpm
