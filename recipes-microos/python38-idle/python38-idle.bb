SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "python38-idle-3.8.16-6.1.aarch64.rpm"
RPM_HASH = "6ba1a3ef52324d4cfb6e5cbc6f5d12e8059a36d6d90d7a65f30b188ece8e77d1b054098fa48531074bd41e6c5d2024e00cc2292dc4259fd90eaa675b3c6e36c1"

RPROVIDES:${PN} += "application() application(idle3.8.desktop) config(python38-idle) metainfo() metainfo(idle3.8.appdata.xml) mimehandler(text/x-python) python38-idle python38-idle(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3.8 python(abi) python38 python38-tk"

inherit rpm
