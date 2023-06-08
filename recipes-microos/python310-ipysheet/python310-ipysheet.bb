SUMMARY = "Spreadsheet widget for the Jupyter notebook"
DESCRIPTION = "A Jupyter widget providing spreadsheets for the Jupyter notebook. \
 \
WARNING \
Due to Handsontable licensing changes ipysheet is stuck witch the \
outdated Handsontable version 6.2.2 (open-source). We recommend \
not using ipysheet anymore. We suggest an alternative like \
ipydatagrid. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-ipysheet-0.7.0-1.4.noarch.rpm"
RPM_HASH = "2de4dd8bb6308229373a67e4e61e5b71f6260ef9a80d4707c1d006975b92cc720338839716aee20e5e0d1c64609cd359c9982c2170d95d4ae68e20df09c789fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipysheet python3.10dist(ipysheet) python310-ipysheet python3dist(ipysheet)"
RDEPENDS:${PN} += "(python310-ipywidgets >= 7.5.0 with python310-ipywidgets < 9) jupyter-ipysheet python(abi)"

inherit rpm
