SUMMARY = "Jupyter Qt console"
DESCRIPTION = "A rich Qt-based console for working with Jupyter kernels, \
supporting rich media output, session export, and more."
LICENSE = "BSD-3-Clause"

PV = "5.4.2"

RPM_NAME = "python39-qtconsole-5.4.2-1.1.noarch.rpm"
RPM_HASH = "c0d1bf964a06f71ca4d6080066ba7ccffe63892d397031f16335a73f3790f31a9aeaa13191d34b8afcb9e72fd82f1753285109ee6e28f4a17728ef78653c7761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(jupyter-qtconsole-3.9.desktop) python3.9dist(qtconsole) python39-jupyter_qtconsole python39-qtconsole python3dist(qtconsole)"
RDEPENDS:${PN} += "(python39-qt5 or python39-pyside2 or python39-PyQt6 or python39-pyside6) /bin/sh /usr/bin/python3.9 alts python(abi) python39-Pygments python39-QtPy python39-ipykernel python39-ipython_genutils python39-jupyter-client python39-jupyter-core python39-packaging python39-pyzmq python39-traitlets"

inherit rpm
