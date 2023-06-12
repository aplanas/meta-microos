SUMMARY = "Pure Java implementation of SSH2"
DESCRIPTION = "JSch allows you to connect to an sshd server and use port forwarding, \
X11 forwarding, file transfer, etc., and you can integrate its \
functionality into your own Java programs."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "jsch-demo-0.2.9-1.1.noarch.rpm"
RPM_HASH = "6550d1d4cab1ec1f13f229f0cd9dc12b8580426797988e98d30fb575d9362c100a2f41d4a6ba0c75cb4f819db9ca08814b5005b144a55792e420020b6a9d737b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch-demo"
RDEPENDS:${PN} += ""

inherit rpm
