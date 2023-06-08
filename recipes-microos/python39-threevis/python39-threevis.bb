SUMMARY = "Plugin for visualizing geometry in a Jupyter Notebook"
DESCRIPTION = "A plugin for visualizing meshes, point clouds, and other geometry in \
a Jupyter Notebook."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.post25"

RPM_NAME = "python39-threevis-0.1.0.post25-6.3.noarch.rpm"
RPM_HASH = "ff29e21ff5510782dceddd577f241184a3c69f10cfb5629f5d11e7249b82dfc4438edfb8f8ca4297e52726030b24cb18ce7a5289dbce2279ec4d5bd58a90749a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(threevis) python39-threevis python3dist(threevis)"
RDEPENDS:${PN} += "python(abi) python39-numpy python39-openmesh python39-pythreejs"

inherit rpm
