SUMMARY = "SMB/CIFS library to support file sharing between Windows and Linux machines"
DESCRIPTION = "pysmb is an experimental SMB/CIFS library written in Python. It implements the client-side SMB/CIFS protocol which allows your Python application to access and transfer files to/from SMB/CIFS shared folders like your Windows file sharing and Samba folders."
LICENSE = "Zlib"

PV = "1.2.9.1"

RPM_NAME = "python311-pysmb-1.2.9.1-1.3.noarch.rpm"
RPM_HASH = "58315ce60f4f7c1308f527d99ca02acd40d85cb08f95b7e703a65ff09cf25a72cef8052a8e3b784b261be0f3035b228e2a27d3886fc2a6c38e003f0102de8c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pysmb) python311-pysmb python3dist(pysmb)"
RDEPENDS:${PN} += "python(abi) python311-pyasn1"

inherit rpm
