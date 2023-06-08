SUMMARY = "PyData helpers for authenticating to Google APIs"
DESCRIPTION = "PyData-Google-Auth is a package providing helpers for authenticating \
to Google APIs."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-pydata-google-auth-1.1.0-1.11.noarch.rpm"
RPM_HASH = "4134eba31f4b4516cca4e3f151538aa587218bb14d730da3c5d464026f2dcfd3d7af87d502329a09fea4adcb105f30ddd109d0885979a2dc55657d561d5fe702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pydata-google-auth) python39-pydata-google-auth python3dist(pydata-google-auth)"
RDEPENDS:${PN} += "python(abi) python39-google-auth python39-google-auth-oauthlib"

inherit rpm
