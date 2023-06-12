SUMMARY = "Pure Python Expect-like module"
DESCRIPTION = "Pexpect is a pure Python module for spawning child applications; \
controlling them; and responding to expected patterns in their output."
LICENSE = "ISC"

PV = "4.8.0"

RPM_NAME = "python39-pexpect-4.8.0-10.1.noarch.rpm"
RPM_HASH = "587659083d136c34ee1bdff6de997dfc28b3f95bee995d179cc6d1070fe77806c486a29ddf0649b77c943e21c44f599f89ef9821ad1ef3ac1f433f1373c31bc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pexpect) \
python39-pexpect \
python3dist(pexpect)"
RDEPENDS:${PN} += "python(abi) \
python39-ptyprocess"

inherit rpm
