SUMMARY = "Interactive visualization package for statistical data for Python"
DESCRIPTION = "This package provides interactive data visualization tools in the Jupyter \
Notebook. \
 \
The interactive visualization tool that is provided allows data selection \
through HTML widgets and outputs a Vega-lite plot through Altair. In the HTML \
widget it is possible to select columns to plot in various encodings. This \
widget also supports some basic configuration (i.e., log vs linear scales)."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python311-altair-widgets-0.2.2-3.7.noarch.rpm"
RPM_HASH = "461a22429dfac575632005a53e51f26f2a94e39360d382d6c3c32d0b26a1fe56238a8a481cef5721ad52d64bd7e8995744f45bbc7b038d0c2350cf0d63ba017b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(altair-widgets) \
python311-altair-widgets \
python311-jupyter_altair-widgets \
python3dist(altair-widgets)"
RDEPENDS:${PN} += "python(abi) \
python311-altair \
python311-ipython \
python311-ipywidgets \
python311-pandas \
python311-vega"

inherit rpm
