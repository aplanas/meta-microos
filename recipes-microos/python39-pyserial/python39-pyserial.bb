SUMMARY = "Python Serial Port Extension"
DESCRIPTION = "Python Serial Port Extension for Win32, Linux, BSD, Jython, IronPython"
LICENSE = "Python-2.0"

PV = "3.5"

RPM_NAME = "python39-pyserial-3.5-3.1.noarch.rpm"
RPM_HASH = "5f985770ab0b26600eca41e72395541c578a399ea97856b30fbc9ae87fd2879aba5721ad59aa0885b8ee9bc06930b3522634226394dc77ec233f183594c07159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyserial) python39-pyserial python39-serial python3dist(pyserial)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
