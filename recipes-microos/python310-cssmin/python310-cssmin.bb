SUMMARY = "YUI CSS compression algorithm"
DESCRIPTION = "This is a Python port of the YUI CSS Compressor."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.2.0"

RPM_NAME = "python310-cssmin-0.2.0-1.5.noarch.rpm"
RPM_HASH = "3cf58f7bd740f13c77c9b5b970c378c8d77b26d7cdc62120cdc251963df59ede1f27b9b83aa4b7fd1af7d1bd42c0c96c36294c69bbfea6de6ecaa8d88f5ac0b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cssmin python3.10dist(cssmin) python310-cssmin python3dist(cssmin)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
