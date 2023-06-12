SUMMARY = "Helper to test WSGI applications - Documentation"
DESCRIPTION = "This package contains documentation files for python-WebTest."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python-WebTest-doc-3.0.0-4.1.noarch.rpm"
RPM_HASH = "10ca6cae0a8b388385ec9cf65f54d7611f58ac7e2952e1a373ffe37c62abd66690efcbbf2d01c07d528d22cb11efc74f37469850fcf31f4b3872e97da65522d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-WebTest-doc python310-WebTest-doc python311-WebTest-doc python39-WebTest-doc"
RDEPENDS:${PN} += ""

inherit rpm
