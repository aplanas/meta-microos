SUMMARY = "Vestigial utilities from IPython"
DESCRIPTION = "This contains some common utilities shared by Jupyter and IPython projects \
during The Big Split. As soon as possible, those packages will remove their \
dependency on this, and this package will go away. \
 \
No projects should depend on this package directly.  It will be pulled in by \
whatever packages need it"
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python311-ipython_genutils-0.2.0-3.11.noarch.rpm"
RPM_HASH = "9c19812a65fe6e8e40ab1160246dc4475b39a674d600587ffc0953b7e59af4373dc6788d0b788eaaff12367dad34e7592ec2ddaf0a5c8b3d3c1475d30ed1fa1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipython-genutils) python311-ipython_genutils python3dist(ipython-genutils)"
RDEPENDS:${PN} += "python(abi) python311 python311-pytest"

inherit rpm
