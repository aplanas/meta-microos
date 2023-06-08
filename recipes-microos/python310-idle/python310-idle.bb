SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.10.10"

RPM_NAME = "python310-idle-3.10.10-2.3.aarch64.rpm"
RPM_HASH = "b4b160814032f289f66382e7d7295daf7db23a595dab5fb93fbc133bc7dd54cc9280904db7f02c61cd0a754e0f214c7ad8a5278ae9621fac086b00815a34481c"

RPROVIDES:${PN} += "application() application(idle3.10.desktop) config(python310-idle) metainfo() metainfo(idle3.10.appdata.xml) mimehandler(text/x-python) python3-idle python310-idle python310-idle(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 /usr/bin/python3.10 python(abi) python310 python310-tk"

inherit rpm
