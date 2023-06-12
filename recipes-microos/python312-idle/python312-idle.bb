SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.12.0b1"

RPM_NAME = "python312-idle-3.12.0b1-1.1.aarch64.rpm"
RPM_HASH = "325849eabff82394c17a56c5caf05f8541a6dd5c66f7187dd8320708401a7e0aa91fee0f53076a6fb3ae671816d7edc06658a752917b18cad689cf0cf8f13127"

RPROVIDES:${PN} += "application() application(idle3.12.desktop) config(python312-idle) metainfo() metainfo(idle3.12.appdata.xml) mimehandler(text/x-python) python312-idle python312-idle(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3.12 python(abi) python312 python312-tk"

inherit rpm
