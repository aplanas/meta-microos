SUMMARY = "PyData helpers for authenticating to Google APIs"
DESCRIPTION = "PyData-Google-Auth is a package providing helpers for authenticating \
to Google APIs."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-pydata-google-auth-1.1.0-1.11.noarch.rpm"
RPM_HASH = "fcce2d3022417861f2e7db2f5391213aed6c4248928faabd3ecb4367ab71620d7fc7797481899ef0b34cc1a71374dbaa1f4370e5d0b843784bc302b8badc1c84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pydata-google-auth) \
python311-pydata-google-auth \
python3dist(pydata-google-auth)"
RDEPENDS:${PN} += "python(abi) \
python311-google-auth \
python311-google-auth-oauthlib"

inherit rpm
