SUMMARY = "Pure Java implementation of SSH2"
DESCRIPTION = "JSch allows you to connect to an sshd server and use port forwarding, \
X11 forwarding, file transfer, etc., and you can integrate its \
functionality into your own Java programs."
LICENSE = "BSD-3-Clause"

PV = "0.1.55"

RPM_NAME = "jsch-demo-0.1.55-2.6.noarch.rpm"
RPM_HASH = "52529536d8623d2b7b8506b8d9785b487b153c21d04359f2f941172ca1b1a44b56e313f33f4479ca7d02574b2e9c5460bd8264f6318891425c2ea0853b8e19f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-demo"
RDEPENDS:${PN} += ""

inherit rpm
