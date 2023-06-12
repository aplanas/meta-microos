SUMMARY = "Python Bindings Generator"
DESCRIPTION = "A tool to generate Python bindings for C/C++ code."
LICENSE = "LGPL-2.1-only"

PV = "0.22.1"

RPM_NAME = "python311-PyBindGen-0.22.1-1.3.noarch.rpm"
RPM_HASH = "3732b83da664ef0f13837aa71fa564ea027558c7ecf1bd76b3796775fc5b5d5cb3de4312adc3485272f7d6c07d0da70c1d002e3322fe605e75b471e0678a5cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pybindgen) \
python311-PyBindGen \
python3dist(pybindgen)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
