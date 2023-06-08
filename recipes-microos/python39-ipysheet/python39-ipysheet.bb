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

RPM_NAME = "python39-ipysheet-0.7.0-1.4.noarch.rpm"
RPM_HASH = "30603e2f1d8bc45b5403e827dfb3b1e668d00c4b43a8e645a37aac2a2453918ccfd26acb22ef3d29d1eba03352a3db735995dac3747e9a939c2823bfad436c87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipysheet) python39-ipysheet python3dist(ipysheet)"
RDEPENDS:${PN} += "(python39-ipywidgets >= 7.5.0 with python39-ipywidgets < 9) jupyter-ipysheet python(abi)"

inherit rpm
