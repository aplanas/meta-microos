SUMMARY = "Library to communicate with remote servers over GMP or OSP"
DESCRIPTION = "The Greenbone Vulnerability Management Python API library python-gvm is a \
collection of APIs that help with remote controlling a Greenbone Security \
Manager (GSM) appliance and its underlying Greenbone Vulnerability Manager \
(GVM). The library essentially abstracts accessing the communication protocols \
Greenbone Management Protocol (GMP) and Open Scanner Protocol (OSP)."
LICENSE = "GPL-3.0-only"

PV = "23.2.0"

RPM_NAME = "python310-python-gvm-23.2.0-1.2.noarch.rpm"
RPM_HASH = "f1369cda9636b24166059a8e945c78e1c4dc69b0c33287e43aa71c3077b74e36d961f8a8dd2fc3838f16b03ac79f153845e3af8d5a5ff28658d1958cd184bcf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-gvm python3.10dist(python-gvm) python310-python-gvm python3dist(python-gvm)"
RDEPENDS:${PN} += "python(abi) python310-defusedxml python310-lxml python310-paramiko"

inherit rpm
