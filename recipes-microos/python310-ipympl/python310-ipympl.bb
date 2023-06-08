SUMMARY = "Matplotlib Jupyter Extension"
DESCRIPTION = "Jupyter extension to display matplotlib plots in a widget. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "python310-ipympl-0.9.3-10.1.noarch.rpm"
RPM_HASH = "a31a921d6e54c5f9af68ad85049e8675e896019339a53d0151d8770797244384f46511a85608c4585599ce934b8b98bc8f24263bcd53d13a6369843adfa8a39f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipympl python3-jupyter_ipympl python3.10dist(ipympl) python310-ipympl python310-jupyter_ipympl python3dist(ipympl)"
RDEPENDS:${PN} += "(python310-ipywidgets >= 7.6.0 with python310-ipywidgets < 9) (python310-matplotlib >= 3.4.0 with python310-matplotlib < 4) jupyter-matplotlib python(abi) python310-Pillow python310-ipython python310-ipython_genutils python310-matplotlib-web python310-numpy python310-traitlets"

inherit rpm
