SUMMARY = "Jupyter Qt console"
DESCRIPTION = "A rich Qt-based console for working with Jupyter kernels, \
supporting rich media output, session export, and more."
LICENSE = "BSD-3-Clause"

PV = "5.4.2"

RPM_NAME = "python311-qtconsole-5.4.2-1.1.noarch.rpm"
RPM_HASH = "d11e9d643c4bba9ef1e5ef63bccfa8b8e8dcf5dd78a825a43b7b852bc433df7e3a4c84a5b05039d03f74fea3d07e184cb5773e901f93ac4508f0a454f2aca345"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(jupyter-qtconsole-3.11.desktop) python3.11dist(qtconsole) python311-jupyter_qtconsole python311-qtconsole python3dist(qtconsole)"
RDEPENDS:${PN} += "(python311-qt5 or python311-pyside2 or python311-PyQt6 or python311-pyside6) /bin/sh /usr/bin/python3.11 alts python(abi) python311-Pygments python311-QtPy python311-ipykernel python311-ipython_genutils python311-jupyter-client python311-jupyter-core python311-packaging python311-pyzmq python311-traitlets"

inherit rpm
