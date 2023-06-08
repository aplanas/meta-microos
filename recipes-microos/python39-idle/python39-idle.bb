SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-idle-3.9.16-6.1.aarch64.rpm"
RPM_HASH = "de4c1e7736b3bdb60957bd8e7506d5bcd32ee97cba17e97457a0e59b98cc610614e5db78b2a2ae5c03f05d12e14016aea7a30cd8b1ff2d6599bc07d8a1ae703b"

RPROVIDES:${PN} += "application() application(idle3.9.desktop) config(python39-idle) metainfo() metainfo(idle3.9.appdata.xml) mimehandler(text/x-python) python39-idle python39-idle(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3.9 python(abi) python39 python39-tk"

inherit rpm
