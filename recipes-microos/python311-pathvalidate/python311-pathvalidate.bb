SUMMARY = "Python library to sanitize/validate a string such as filenames"
DESCRIPTION = "pathvalidate is a Python library to sanitize/validate a string such as \
filenames/file-paths/etc."
LICENSE = "MIT"

PV = "2.5.2"

RPM_NAME = "python311-pathvalidate-2.5.2-1.2.noarch.rpm"
RPM_HASH = "e1d1ea7eea08c263c21c5bd15ba4c8afba9624db517449eef6a96613841e2ecfc2caaf7e009255c4d40ce8bfb96e277c6481708f7c9e5a087bf2264b9c2ca560"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pathvalidate) python311-pathvalidate python3dist(pathvalidate)"
RDEPENDS:${PN} += "python(abi) python311-setuptools"

inherit rpm
