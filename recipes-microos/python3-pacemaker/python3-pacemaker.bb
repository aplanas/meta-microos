SUMMARY = "Python libraries for Pacemaker"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
The python3-pacemaker package contains a Python library that can be used \
to interface with Pacemaker."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.5+20230320.22590c566"

RPM_NAME = "python3-pacemaker-2.1.5+20230320.22590c566-1.1.noarch.rpm"
RPM_HASH = "539fbf6bc4d10fa53475fe27375e1a1c41fc3ffd080f723f2378f682ee31c6a7f70e2cb426154496c49dd8f9f01e70aa87a68c47653a26a1c78e5f63e50c4b78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pacemaker python3.10dist(pacemaker) python3dist(pacemaker)"
RDEPENDS:${PN} += "pacemaker-libs python(abi) python3"

inherit rpm
