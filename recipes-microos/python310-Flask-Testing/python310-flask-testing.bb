SUMMARY = "Unit testing for Flask"
DESCRIPTION = "Unit testing for Flask."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python310-Flask-Testing-0.8.1-4.3.noarch.rpm"
RPM_HASH = "303da6eda3de16866ba4e6ac3eb7fb0bb08480ea78a113539a6cef6977a36434b7fb2c45f5c05e3d291b59981085023315f94d1379e2bf3a52fb254e6cd9da1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Testing python3.10dist(flask-testing) python310-Flask-Testing python3dist(flask-testing)"
RDEPENDS:${PN} += "python(abi) python310-Flask"

inherit rpm
