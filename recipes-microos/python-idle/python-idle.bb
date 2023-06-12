SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-idle-2.7.18-34.1.aarch64.rpm"
RPM_HASH = "b3ccd6309ab39637433d175543a99d41a8ab8a08fb578631d799fe26f5d49dca917ba35db410df92b2d8593c855f9b14bb2cf2f36f411353cbe64f424eb151fb"

RPROVIDES:${PN} += "application() application(idle.desktop) config(python-idle) mimehandler(text/x-python) python-idle python-idle(aarch-64) python2-idle"
RDEPENDS:${PN} += "/usr/bin/python /usr/bin/python2.7 python-base python-tk"

inherit rpm
