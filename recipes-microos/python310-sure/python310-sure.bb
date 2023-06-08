SUMMARY = "Utility belt for automated testing in python for python"
DESCRIPTION = "A testing library for python with powerful and flexible assertions. Sure is \
heavily inspired by should.js"
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python310-sure-2.0.0-3.5.noarch.rpm"
RPM_HASH = "a294ffefe7c78590f8715f36ef92999b56562862288b2b1f70f88fc787a93fed6b53e95fa0891792be379013897e3d49f660bfd86101d4db5bf78712fb61d360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sure python3.10dist(sure) python310-sure python3dist(sure)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-six update-alternatives"

inherit rpm
