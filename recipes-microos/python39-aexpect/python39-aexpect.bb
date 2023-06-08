SUMMARY = "Python library to control interactive applications"
DESCRIPTION = "Aexpect is a Python library used to control interactive applications, very \
similar to pexpect. It can be used to control applications such as ssh, scp \
sftp, telnet, among others."
LICENSE = "GPL-2.0-only"

PV = "1.6.4"

RPM_NAME = "python39-aexpect-1.6.4-2.4.noarch.rpm"
RPM_HASH = "da4398a958d923e3c2eb2913d4c9eb74cd14235ebf33cfa58eedc202a221c79d693cc3a6f68e06438227d71e9cc968aa3995fdcc66bd31273998e2275a960e96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aexpect) python39-aexpect python3dist(aexpect)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
