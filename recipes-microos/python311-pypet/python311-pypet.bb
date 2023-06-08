SUMMARY = "Parameter exploration and storage of results for numerical simulations"
DESCRIPTION = "pypet is the Python parameter exploration toolkit. pypet manages \
exploration of the parameter space of any numerical simulation in \
Python, thereby storing data into HDF5 files. Moreover, pypet offers \
a data container which gives access to all parameters and results \
from a single source."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python311-pypet-0.6.0-2.3.noarch.rpm"
RPM_HASH = "ff59126b36c3405a5a790637fe9bedfa5fb3aa4141c4b65a5ba5069b4e3b7e3193655f4890d4c2fd9b642c6d6259045c0d451d03ba80c9259077dae4135fe071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pypet) python311-pypet python3dist(pypet)"
RDEPENDS:${PN} += "python(abi) python311-numpy python311-pandas python311-scipy python311-tables"

inherit rpm
