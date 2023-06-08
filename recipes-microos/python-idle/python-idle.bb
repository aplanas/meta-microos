SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-idle-2.7.18-33.1.aarch64.rpm"
RPM_HASH = "a5be06c77b5ad4d514515f6bc98412a15e9000475802cd3aa349d92e98638875013804a413679cf1f9d80201ee5305d9a5025a869dafb847f7b785a70fcf2cbe"

RPROVIDES:${PN} += "application() application(idle.desktop) config(python-idle) mimehandler(text/x-python) python-idle python-idle(aarch-64) python2-idle"
RDEPENDS:${PN} += "/usr/bin/python /usr/bin/python2.7 python-base python-tk"

inherit rpm
