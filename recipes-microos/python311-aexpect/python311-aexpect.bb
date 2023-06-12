SUMMARY = "Python library to control interactive applications"
DESCRIPTION = "Aexpect is a Python library used to control interactive applications, very \
similar to pexpect. It can be used to control applications such as ssh, scp \
sftp, telnet, among others."
LICENSE = "GPL-2.0-only"

PV = "1.6.4"

RPM_NAME = "python311-aexpect-1.6.4-2.4.noarch.rpm"
RPM_HASH = "2a6a23068602a6bbda604bb2af6577c983747a57fdbb67458de63cf9ca6cfe72f18d38f5850233c0dde5db99d9eb18b2c043c783a477b3714d3d5b858b5768c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aexpect) \
python311-aexpect \
python3dist(aexpect)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
