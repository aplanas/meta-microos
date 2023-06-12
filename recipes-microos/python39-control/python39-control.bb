SUMMARY = "Python control systems library"
DESCRIPTION = "The Python Control Systems Library is a Python module that implements basic \
operations for analysis and design of feedback control systems."
LICENSE = "BSD-3-Clause"

PV = "0.9.3.post2"

RPM_NAME = "python39-control-0.9.3.post2-2.1.noarch.rpm"
RPM_HASH = "fbaaff9b83f39da92fff31d9fd7baa6f11fda372f3bcf42a066a7203bdf505d90163688a248f57a8d1d584a6b5507affb1655fa5a90cc5cb73fd0539376f257c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(control) \
python39-control \
python3dist(control)"
RDEPENDS:${PN} += "python(abi) \
python39-matplotlib \
python39-numpy \
python39-scipy"

inherit rpm
