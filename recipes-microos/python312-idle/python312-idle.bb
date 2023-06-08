SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.12.0a7"

RPM_NAME = "python312-idle-3.12.0a7-1.1.aarch64.rpm"
RPM_HASH = "994d7445a52cab9f6f4f151ab58677df4fe4c771c15803908ab4c005ffe0f3d9558e8dafb9d4e07e18fdedd97506e3742ad81638b4a25ed2477abde01c4d54a8"

RPROVIDES:${PN} += "application() application(idle3.12.desktop) config(python312-idle) metainfo() metainfo(idle3.12.appdata.xml) mimehandler(text/x-python) python312-idle python312-idle(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3.12 python(abi) python312 python312-tk"

inherit rpm
