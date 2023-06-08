SUMMARY = "Jupyter interactive widgets for Jupyter Notebook"
DESCRIPTION = "This package makes Jupyter widgets available in the classic Jupyter Notebook. \
This package provides the necessary JavaScript controls in the Jupyter \
Notebook that communicate with the widget objects in the kernel. \
 \
Install the corresponding Jupyter widgets package into your kernel, i.e., \
IPython users would install ipywidgets into their kernel."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.7"

RPM_NAME = "python310-widgetsnbextension-4.0.7-1.1.noarch.rpm"
RPM_HASH = "343d3ff5ea9b54b7a5715a130e4706ebce3d2494502d2eea37ccea7f1d5540ca917bf5f3d534b1090b71c99803db484de0edfbbf457e182ec528247bafce70e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter_widgetsnbextension python3-widgetsnbextension python3.10dist(widgetsnbextension) python310-jupyter_widgetsnbextension python310-widgetsnbextension python3dist(widgetsnbextension)"
RDEPENDS:${PN} += "jupyter-widgetsnbextension python(abi)"

inherit rpm
