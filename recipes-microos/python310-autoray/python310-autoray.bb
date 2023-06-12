SUMMARY = "A lightweight python automatic-array library"
DESCRIPTION = "Write backend agnostic numeric code compatible with any numpy-ish array library."
LICENSE = "Apache-2.0"

PV = "0.6.3"

RPM_NAME = "python310-autoray-0.6.3-1.1.noarch.rpm"
RPM_HASH = "6392a4511c29bdb2e6d0601d70ba56f3cf2297a32659ed363385b42bad2db7c0bca5586967d11289ac0c67381f2be07c6e3439ca0dfc666c2ed8db20ea44a844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autoray \
python3.10dist(autoray) \
python310-autoray \
python3dist(autoray)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
