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

RPM_NAME = "python311-ipysheet-0.7.0-1.4.noarch.rpm"
RPM_HASH = "27dec396f672ef0a57113eeeeba8c6184a4c01f833eb99b4d3c4ee25afb2c767b979d7c9eb376c121e1a3285abfe7a45910c249bc4779a6b7381c9be9391818d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipysheet) python311-ipysheet python3dist(ipysheet)"
RDEPENDS:${PN} += "(python311-ipywidgets >= 7.5.0 with python311-ipywidgets < 9) jupyter-ipysheet python(abi)"

inherit rpm
