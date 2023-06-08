SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.11.2"

RPM_NAME = "python311-idle-3.11.2-1.2.aarch64.rpm"
RPM_HASH = "bcc92796fe8933d7226c35a3a37b9dba155718ebd4f313939f84e2fc54114fcd1d055220c3af0887c8aa6ebdac8b9d722d8bd8a6dc60a955d6b48789c9f651c6"

RPROVIDES:${PN} += "application() application(idle3.11.desktop) config(python311-idle) metainfo() metainfo(idle3.11.appdata.xml) mimehandler(text/x-python) python311-idle python311-idle(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3.11 python(abi) python311 python311-tk"

inherit rpm
