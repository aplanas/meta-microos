SUMMARY = "Jupyter Qt console"
DESCRIPTION = "A rich Qt-based console for working with Jupyter kernels, \
supporting rich media output, session export, and more."
LICENSE = "BSD-3-Clause"

PV = "5.4.2"

RPM_NAME = "python310-qtconsole-5.4.2-1.1.noarch.rpm"
RPM_HASH = "6d4950dd4b4abf6fe52d631911e6e366b066986c79a3349ec7294161abc64910cc13e73d07da8e7cf9275b616364a6c75eef8bf330a753123e2700bcf5c4556b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(jupyter-qtconsole-3.10.desktop) jupyter-qtconsole python3-jupyter_qtconsole python3-qtconsole python3.10dist(qtconsole) python310-jupyter_qtconsole python310-qtconsole python3dist(qtconsole)"
RDEPENDS:${PN} += "(python310-qt5 or python310-pyside2 or python310-PyQt6 or python310-pyside6) /bin/sh /usr/bin/python3.10 alts python(abi) python310-Pygments python310-QtPy python310-ipykernel python310-ipython_genutils python310-jupyter-client python310-jupyter-core python310-packaging python310-pyzmq python310-traitlets"

inherit rpm
