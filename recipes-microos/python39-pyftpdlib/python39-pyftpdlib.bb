SUMMARY = "Asynchronous FTP server library for Python"
DESCRIPTION = "The Python FTP server library provides a high-level interface to \
write very asynchronous FTP servers with Python."
LICENSE = "MIT"

PV = "1.5.7"

RPM_NAME = "python39-pyftpdlib-1.5.7-2.1.noarch.rpm"
RPM_HASH = "fa674f56441153d9efb01198377754eda094e33835077252a968dac10643d446a295460403e4f5e2a0828709f51a5789f430d8475fcbb41361b861629fe32d8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyftpdlib) python39-pyftpdlib python3dist(pyftpdlib)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-pyOpenSSL update-alternatives"

inherit rpm
