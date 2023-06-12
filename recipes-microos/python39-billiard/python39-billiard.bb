SUMMARY = "Python multiprocessing fork"
DESCRIPTION = "billiard is a fork of the Python 2.7 multiprocessing package. The \
multiprocessing package itself is a renamed and updated version of \
R. Oudkerk's pyprocessing package. This standalone variant is \
compatible with Python 2.4 and 2.5, and will draw its \
fixes/improvements from python-trunk."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python39-billiard-4.1.0-1.3.noarch.rpm"
RPM_HASH = "9bd4e53545a2f3de57e8786b7167354b81eecffd0866f8c1c5dc429c98abeb2822769b3731c4b2a331666c8b25640589d5baf3745ab40d0b28700d952c522075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(billiard) \
python39-billiard \
python3dist(billiard)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
