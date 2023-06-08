SUMMARY = "Interactive parallel computing library for IPython"
DESCRIPTION = "Use multiple instances of IPython in parallel, interactively. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "8.6.1"

RPM_NAME = "python310-ipyparallel-8.6.1-1.1.noarch.rpm"
RPM_HASH = "45b31e2cb234b13580882bd6a3435cf159b914b8b3f05e954d23e4d24cdf266c589c74f38fed9df0d57b4daee90e30063591abede0026ca98a59f1f7259ba7f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyparallel python3-jupyter_ipyparallel python3.10dist(ipyparallel) python310-ipyparallel python310-jupyter_ipyparallel python3dist(ipyparallel)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-decorator python310-entrypoints python310-ipykernel python310-ipython python310-jupyter-client python310-psutil python310-python-dateutil python310-pyzmq python310-tornado python310-tqdm python310-traitlets update-alternatives"

inherit rpm
