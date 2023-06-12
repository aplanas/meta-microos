SUMMARY = "A widget library for scales"
DESCRIPTION = "A Jupyter/IPython widget library for scales. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python310-ipyscales-0.7.0-5.4.noarch.rpm"
RPM_HASH = "fa88c183f4211b8098f136723dd07db2443ae8ca5b58c621f88924e4204571145977465c656aeb34cee736d47d4cd5faf6cc886475c8c29089522b12dd2b47ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyscales \
python3-jupyter_ipyscales \
python3.10dist(ipyscales) \
python310-ipyscales \
python310-jupyter_ipyscales \
python3dist(ipyscales)"
RDEPENDS:${PN} += "jupyter-ipyscales \
python(abi) \
python310-ipywidgets \
python310-numpy"

inherit rpm
