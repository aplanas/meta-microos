SUMMARY = "Devel files for python311-PyQt6-DataVisualization"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python311-PyQt6-DataVisualization"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-DataVisualization-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "29173a521445f0ad9c970af7801529bd0e5b0acf45b779f82b900f1231cb5befe37a8b3b834a8cbce2844576f96f51d021314fd5e9d0d574d775e96ccfecbda6"

RPROVIDES:${PN} += "python311-PyQt6-DataVisualization-devel \
python311-PyQt6-DataVisualization-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) \
python311-PyQt6-devel"

inherit rpm
