SUMMARY = "SMB/CIFS library to support file sharing between Windows and Linux machines"
DESCRIPTION = "pysmb is an experimental SMB/CIFS library written in Python. It implements the client-side SMB/CIFS protocol which allows your Python application to access and transfer files to/from SMB/CIFS shared folders like your Windows file sharing and Samba folders."
LICENSE = "Zlib"

PV = "1.2.9.1"

RPM_NAME = "python39-pysmb-1.2.9.1-1.3.noarch.rpm"
RPM_HASH = "668f634eb5d5e2cc632b162135244ff5844aca6eb22f12c9a908828ad35fc3c145f144a058869f4d9afa2d91340d91a0d288f02b9a4454b36d0ff0cd749fab78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pysmb) python39-pysmb python3dist(pysmb)"
RDEPENDS:${PN} += "python(abi) python39-pyasn1"

inherit rpm
