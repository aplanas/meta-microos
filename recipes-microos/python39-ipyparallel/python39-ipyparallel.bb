SUMMARY = "Interactive parallel computing library for IPython"
DESCRIPTION = "Use multiple instances of IPython in parallel, interactively. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "8.6.1"

RPM_NAME = "python39-ipyparallel-8.6.1-1.1.noarch.rpm"
RPM_HASH = "b8732c7be568a8fa92ae675da355369692bcb93034010e082817a7ee0c873e5998979c1ed5ab242fde0e4f5331817e39fc636cc53c4c735425d56a35e267998c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipyparallel) python39-ipyparallel python39-jupyter_ipyparallel python3dist(ipyparallel)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-decorator python39-entrypoints python39-ipykernel python39-ipython python39-jupyter-client python39-psutil python39-python-dateutil python39-pyzmq python39-tornado python39-tqdm python39-traitlets update-alternatives"

inherit rpm
