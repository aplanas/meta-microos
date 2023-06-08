SUMMARY = "A QScintilla-based text-editor component"
DESCRIPTION = "QProgEdit is a PyQt widget that implements a text editor \
component. Its primary target at the moment is OpenSesame, a graphical \
experiment builder."
LICENSE = "GPL-3.0-or-later"

PV = "4.1.2"

RPM_NAME = "python39-python-qprogedit-4.1.2-2.19.noarch.rpm"
RPM_HASH = "386d00d1fbced5ef0ad424e8829ad13e4669020929d40aaee79e4340c11b5b2a8229590f9cd33bec3a9a315cb5f774b5e33974f73cfa1b28b086207615db8fd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-qprogedit) python39-python-qprogedit python3dist(python-qprogedit)"
RDEPENDS:${PN} += "python(abi) python39-QtPy python39-qscintilla-qt5"

inherit rpm
