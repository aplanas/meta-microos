SUMMARY = "Editable interval tree data structure for Python"
DESCRIPTION = "A mutable, self-balancing interval tree for Python 2 and 3. Queries may \
be by point, by range overlap, or by range envelopment. \
 \
This library was designed to allow tagging text and time intervals, \
where the intervals include the lower bound but not the upper bound."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python310-intervaltree-3.1.0-1.4.noarch.rpm"
RPM_HASH = "f8de16689fda5d42d357622794e18ac11fc665fb299db5458fba06dc6376259b79b04cf54f10b8347b91b72ee2773cccee7264b9619faa7fa6b4e23fdc2c9428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-intervaltree python3.10dist(intervaltree) python310-intervaltree python3dist(intervaltree)"
RDEPENDS:${PN} += "python(abi) python310-sortedcontainers"

inherit rpm
