SUMMARY = "Asynchronous SSHv2 client and server library"
DESCRIPTION = "AsyncSSH is a Python package which provides an asynchronous client and \
server implementation of the SSHv2 protocol on top of the Python asyncio framework."
LICENSE = "EPL-2.0 | GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "python310-asyncssh-2.13.1-1.2.noarch.rpm"
RPM_HASH = "7bc45ccfcd85259e39150713452abf2ba18aab2f192e52928c78f2de48834463c347caca249d200f60652c9d43c64603ebef5b65f67fc0d1deb6983a832decf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asyncssh python3.10dist(asyncssh) python310-asyncssh python3dist(asyncssh)"
RDEPENDS:${PN} += "python(abi) python310-bcrypt python310-cryptography python310-gssapi python310-libnacl python310-pyOpenSSL"

inherit rpm
