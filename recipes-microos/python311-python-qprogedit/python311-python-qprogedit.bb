SUMMARY = "A QScintilla-based text-editor component"
DESCRIPTION = "QProgEdit is a PyQt widget that implements a text editor \
component. Its primary target at the moment is OpenSesame, a graphical \
experiment builder."
LICENSE = "GPL-3.0-or-later"

PV = "4.1.2"

RPM_NAME = "python311-python-qprogedit-4.1.2-2.19.noarch.rpm"
RPM_HASH = "cb23a1ed7b4651ee2fc3a241d11df81a668714ca9675f496cc776b329c7cd63a6539f6714d35345ef7b3e65fa1ad9f8819396af083f735afff76812d13255f81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-qprogedit) python311-python-qprogedit python3dist(python-qprogedit)"
RDEPENDS:${PN} += "python(abi) python311-QtPy python311-qscintilla-qt5"

inherit rpm
