SUMMARY = "A python client for etcd"
DESCRIPTION = "A python client for etcd cluster"
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python311-etcd-0.4.5-4.11.noarch.rpm"
RPM_HASH = "d566992b43ddcc91f68f5ead2f342d48026c14ecfd8e31ae44d6d4e10f537cc7552fbad476dced0306870ba1f1eb1cb1f61c6dd8a431ba1b94f06b457238463a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-etcd) python311-etcd python3dist(python-etcd)"
RDEPENDS:${PN} += "python(abi) python311-dnspython python311-urllib3"

inherit rpm
