SUMMARY = "Asynchronous SSHv2 client and server library"
DESCRIPTION = "AsyncSSH is a Python package which provides an asynchronous client and \
server implementation of the SSHv2 protocol on top of the Python asyncio framework."
LICENSE = "EPL-2.0 | GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "python311-asyncssh-2.13.1-1.2.noarch.rpm"
RPM_HASH = "ce8cfc99145cf077b7506216b58ca44b22a16b8cbdb925711f0a96231f076a70f37bae4fdaabc31fdd67c0529a980da6d14a5780134232b8ed0afab1bb1632d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asyncssh) python311-asyncssh python3dist(asyncssh)"
RDEPENDS:${PN} += "python(abi) python311-bcrypt python311-cryptography python311-gssapi python311-libnacl python311-pyOpenSSL"

inherit rpm
