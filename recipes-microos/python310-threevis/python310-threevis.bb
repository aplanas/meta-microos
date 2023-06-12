SUMMARY = "Plugin for visualizing geometry in a Jupyter Notebook"
DESCRIPTION = "A plugin for visualizing meshes, point clouds, and other geometry in \
a Jupyter Notebook."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.post25"

RPM_NAME = "python310-threevis-0.1.0.post25-6.3.noarch.rpm"
RPM_HASH = "8cbb7119e814807b7e47ec95eac86a0de36052b55c3c483859a97dd1c1605a427ae54e63e47c44d59194c582db06f57ea3740f44c803bc8eeec166867f030b1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-threevis \
python3.10dist(threevis) \
python310-threevis \
python3dist(threevis)"
RDEPENDS:${PN} += "python(abi) \
python310-numpy \
python310-openmesh \
python310-pythreejs"

inherit rpm
