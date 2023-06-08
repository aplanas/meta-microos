SUMMARY = "The PEP 517 compliant PyQt build system"
DESCRIPTION = "PyQt-builder is the PEP 517 compliant build system for PyQt and projects that \
extend PyQt. It extends the sip build system and uses Qt’s qmake to perform the \
actual compilation and installation of extension modules. \
 \
Projects that use PyQt-builder provide an appropriate pyproject.toml file and an \
optional project.py script. Any PEP 517 compliant frontend, for example \
sip-install or pip can then be used to build and install the project."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "1.15.0"

RPM_NAME = "python39-pyqt-builder-1.15.0-1.1.noarch.rpm"
RPM_HASH = "16d2fb3f3fa38777624ec9c1398eae32f928dd819b5c718db8155941851ba3f89519e954680675fb95c425b32677fb265e2bd45718788560e022b23870dc5fc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyqt-builder) python39-PyQt-builder python39-pyqt-builder python3dist(pyqt-builder)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-packaging python39-sip-devel update-alternatives"

inherit rpm
