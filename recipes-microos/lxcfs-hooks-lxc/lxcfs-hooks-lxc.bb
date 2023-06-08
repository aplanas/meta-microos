SUMMARY = "LXC hooks for lxcfs"
DESCRIPTION = "Configuration to add hooks for lxcfs so that it automatically interoperates \
with LXC for all containers."
LICENSE = "Apache-2.0"

PV = "5.0.2"

RPM_NAME = "lxcfs-hooks-lxc-5.0.2-2.2.noarch.rpm"
RPM_HASH = "181b63b7dd9c555eb0eb82b8b22baa220edd5824bdfa4c05ddf00c2cf5067b195fe828632755bcd90273c68f0af5e2293aef4cd9520e8a757680ac92c3d115ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxcfs-hooks-lxc"
RDEPENDS:${PN} += "lxcfs"

inherit rpm
