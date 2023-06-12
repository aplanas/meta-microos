SUMMARY = "Python control systems library"
DESCRIPTION = "The Python Control Systems Library is a Python module that implements basic \
operations for analysis and design of feedback control systems."
LICENSE = "BSD-3-Clause"

PV = "0.9.3.post2"

RPM_NAME = "python38-control-0.9.3.post2-2.1.noarch.rpm"
RPM_HASH = "720354435ce14188552d3afa647e036d72420b61dbce62bd695fd99a6ad73e3ab6d83e4e82a8f3fe43d0c77b40b82093f259747b889996e6d11c5686290674d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(control) \
python38-control \
python3dist(control)"
RDEPENDS:${PN} += "python(abi) \
python38-matplotlib \
python38-numpy \
python38-scipy"

inherit rpm
