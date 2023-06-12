SUMMARY = "Object-oriented paths"
DESCRIPTION = "Python object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python311-pathable-0.4.3-3.1.noarch.rpm"
RPM_HASH = "8f38cd42a04fe46b31617422588499aed7758de4d907b6a3e9bafe6cae189f8b230243f73ff5b05c57f5974ed7c1e819f26cc0a12065cba216acf2ae0279a7fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pathable) python311-dictpath python311-pathable python3dist(pathable)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
