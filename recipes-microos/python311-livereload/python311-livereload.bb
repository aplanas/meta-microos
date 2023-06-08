SUMMARY = "Livereload server in python"
DESCRIPTION = "Reload webpages on changes, without hitting refresh in your browser."
LICENSE = "BSD-2-Clause"

PV = "2.6.3"

RPM_NAME = "python311-livereload-2.6.3-5.2.noarch.rpm"
RPM_HASH = "fdc2e9f1e6c9ef5f79e45cc5f13827007a1d1724a5002459502d6f4593f4d253b2bb015c545be038e33a3d6225f9a7da65556144d0efafa1772975c6fddfcc5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(livereload) python311-livereload python3dist(livereload)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-six python311-tornado update-alternatives"

inherit rpm
