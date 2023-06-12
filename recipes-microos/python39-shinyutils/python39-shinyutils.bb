SUMMARY = "Various utilities for Python"
DESCRIPTION = "This package contains utilities for tasks in Python, including \
matplotlib, subclasses, argument parsing, and logging."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-shinyutils-3.1.0-2.9.noarch.rpm"
RPM_HASH = "a2ac88dff19ad3179694dfc6b3494ad94828d52f0bfd8dfb8e9970a725f42fcafb4a14117facb81cb0a3c949f75b228d8295174afd40361f07e23dbd3271d8d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(shinyutils) \
python39-shinyutils \
python3dist(shinyutils)"
RDEPENDS:${PN} += "python(abi) \
python39-crayons \
python39-matplotlib \
python39-seaborn"

inherit rpm
