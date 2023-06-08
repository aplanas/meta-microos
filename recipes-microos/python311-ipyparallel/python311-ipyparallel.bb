SUMMARY = "Interactive parallel computing library for IPython"
DESCRIPTION = "Use multiple instances of IPython in parallel, interactively. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "8.6.1"

RPM_NAME = "python311-ipyparallel-8.6.1-1.1.noarch.rpm"
RPM_HASH = "95d0ba867c77428f313492718e0c40e35eb1f801cf2e2337fa56cd274db3f848f4fd0e797f43f3dfbff0e93445218a31a54d621d2eb863388ad89d2f37491c32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipyparallel) python311-ipyparallel python311-jupyter_ipyparallel python3dist(ipyparallel)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-decorator python311-entrypoints python311-ipykernel python311-ipython python311-jupyter-client python311-psutil python311-python-dateutil python311-pyzmq python311-tornado python311-tqdm python311-traitlets update-alternatives"

inherit rpm
