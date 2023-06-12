SUMMARY = "Automate generation of man pages for python click applications"
DESCRIPTION = "Automate generation of man pages for Python Click applications."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-click-man-0.4.1-1.15.noarch.rpm"
RPM_HASH = "7918cb4d1c87eed8209131e349ad82d2d4773d95963e9d80a4aa5c78fe091c30ffef673dda7cc4d5c8e6ad370e3760e8283a9a633a1fd0771846f77ce0e8b65f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(click-man) \
python39-click-man \
python3dist(click-man)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-click"

inherit rpm
