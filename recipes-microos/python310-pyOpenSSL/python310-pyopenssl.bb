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

RPM_NAME = "python310-pyOpenSSL-23.1.1-2.1.noarch.rpm"
RPM_HASH = "26e835ef258cd4ebd653c1a5de8276b80c684c98772275638101cbfb8eab5625beda37c955b07fbeb65da73cc61294e0e37234550dd7320d299658bbff412027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyOpenSSL \
python3-pyOpenSSL \
python3.10dist(pyopenssl) \
python310-pyOpenSSL \
python3dist(pyopenssl)"
RDEPENDS:${PN} += "(python310-cryptography >= 38.0.0 with python310-cryptography < 41) \
python(abi) \
python310-cffi"

inherit rpm
