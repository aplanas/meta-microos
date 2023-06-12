SUMMARY = "The PEP 517 compliant PyQt build system"
DESCRIPTION = "PyQt-builder is the PEP 517 compliant build system for PyQt and projects that \
extend PyQt. It extends the sip build system and uses Qt’s qmake to perform the \
actual compilation and installation of extension modules. \
 \
Projects that use PyQt-builder provide an appropriate pyproject.toml file and an \
optional project.py script. Any PEP 517 compliant frontend, for example \
sip-install or pip can then be used to build and install the project."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "1.15.1"

RPM_NAME = "python310-pyqt-builder-1.15.1-1.1.noarch.rpm"
RPM_HASH = "4530ead9a3e931256158fb9d857db4d5d5255a18683a810b4160500222f6bf5fcfcb7a598905591c13d992ba2a16a482eeb7f5c66265c94d475fbb89977d4c0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyQt-builder \
python3-pyqt-builder \
python3.10dist(pyqt-builder) \
python310-PyQt-builder \
python310-pyqt-builder \
python3dist(pyqt-builder)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-packaging \
python310-sip-devel \
update-alternatives"

inherit rpm
