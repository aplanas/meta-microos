SUMMARY = "Enhanced Python `compileall` module"
DESCRIPTION = "Enhanced Python `compileall` module."
LICENSE = "Python-2.0"

PV = "0.7.2"

RPM_NAME = "python311-compileall2-0.7.2-1.4.noarch.rpm"
RPM_HASH = "9d7191680c729fc507c9f46f26d2d64bb3cd1c74e339bdfd7ce8a8b167c8649482fc2e146096065076dc0cdb219ff757be1cd2c92f6898305f53263c86d9fe9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(compileall2) python311-compileall2 python3dist(compileall2)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi)"

inherit rpm
