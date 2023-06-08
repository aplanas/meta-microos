SUMMARY = "Python bindings for the remote Jenkins API"
DESCRIPTION = "This package provides Python bindings for the Jenkins Remote \
API. It currently supports management of: \
 * Project configuration \
 * Build control \
 * Slave node configuration"
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python39-python-jenkins-1.8.0-1.1.noarch.rpm"
RPM_HASH = "07d44fc2c6c1aecd8101c3c3d66663da951bdf6ff278c1258987a9d539bb13256f6f03a6ec06eb332ce4c35bea35a4fb5f11fa4924a612fa92dc23ae5f39452f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-jenkins) python39-jenkins python39-python-jenkins python3dist(python-jenkins)"
RDEPENDS:${PN} += "python(abi) python39-multi_key_dict python39-pbr python39-requests python39-six"

inherit rpm
