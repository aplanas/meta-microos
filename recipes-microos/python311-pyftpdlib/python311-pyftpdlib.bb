SUMMARY = "Asynchronous FTP server library for Python"
DESCRIPTION = "The Python FTP server library provides a high-level interface to \
write very asynchronous FTP servers with Python."
LICENSE = "MIT"

PV = "1.5.7"

RPM_NAME = "python311-pyftpdlib-1.5.7-2.1.noarch.rpm"
RPM_HASH = "3a1c0bddfdd206cabb1b51d6f9a991e476fd2eb352af52d33f361fbc529dd98a84dcf89603341cffd3be8895e57271042b0d332852112823af068fbdc52ac968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyftpdlib) python311-pyftpdlib python3dist(pyftpdlib)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-pyOpenSSL update-alternatives"

inherit rpm
