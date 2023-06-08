SUMMARY = "Plugin for visualizing geometry in a Jupyter Notebook"
DESCRIPTION = "A plugin for visualizing meshes, point clouds, and other geometry in \
a Jupyter Notebook."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.post25"

RPM_NAME = "python311-threevis-0.1.0.post25-6.3.noarch.rpm"
RPM_HASH = "be916f7892595caba95ee0c36996dd4e179b0ae10ee37996ade79b68338ae778c7f4b889b574e811de584cbeea5007a34d24024d9c32947d31f74ac3944a9d16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(threevis) python311-threevis python3dist(threevis)"
RDEPENDS:${PN} += "python(abi) python311-numpy python311-openmesh python311-pythreejs"

inherit rpm
