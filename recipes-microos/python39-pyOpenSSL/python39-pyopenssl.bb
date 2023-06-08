SUMMARY = "Python wrapper module around the OpenSSL library"
DESCRIPTION = "pyOpenSSL is a set of Python bindings for OpenSSL.  It includes some low-level \
cryptography APIs but is primarily focused on providing an API for using the \
TLS protocol from Python. \
 \
pyOpenSSL is now a pure-Python project with a dependency on a new project, \
cryptography (<https://github.com/pyca/cryptography>), which provides (among \
other things) a cffi-based interface to OpenSSL."
LICENSE = "Apache-2.0"

PV = "23.1.1"

RPM_NAME = "python39-pyOpenSSL-23.1.1-2.1.noarch.rpm"
RPM_HASH = "fac6a3dfca5de9a661e7d5874a1a5e54539aabc0c2a0df2f2e704949f194bddfd6f4ed888d63165782957f695c4f707b85c22fc6ce30a499e9789300f8fa23a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyOpenSSL python3.9dist(pyopenssl) python39-pyOpenSSL python3dist(pyopenssl)"
RDEPENDS:${PN} += "(python39-cryptography >= 38.0.0 with python39-cryptography < 41) python(abi) python39-cffi"

inherit rpm
