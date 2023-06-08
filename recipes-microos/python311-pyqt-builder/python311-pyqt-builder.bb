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

RPM_NAME = "python311-pyqt-builder-1.15.0-1.1.noarch.rpm"
RPM_HASH = "bb7449e5b2193e67ce8bfaebe8df41cac1ba9fcb7d5601650d48c275fd4447ebaded17096f2446250f63179449ca6947234457b963a677f4ee78c7854f0e9ec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyqt-builder) python311-PyQt-builder python311-pyqt-builder python3dist(pyqt-builder)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-packaging python311-sip-devel update-alternatives"

inherit rpm
