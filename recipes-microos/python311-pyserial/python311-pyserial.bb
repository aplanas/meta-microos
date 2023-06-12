SUMMARY = "Python Serial Port Extension"
DESCRIPTION = "Python Serial Port Extension for Win32, Linux, BSD, Jython, IronPython"
LICENSE = "Python-2.0"

PV = "3.5"

RPM_NAME = "python311-pyserial-3.5-3.1.noarch.rpm"
RPM_HASH = "b9331aafd1a39a5a4ebe544e3e506e79216c414fc8b9b27fb4813303648bd1bd6f56c1a7aae9ff33a31cdf316a6e6ac87165a1f784db517276f10beaeed99164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyserial) \
python311-pyserial \
python311-serial \
python3dist(pyserial)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
