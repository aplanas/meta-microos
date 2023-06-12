SUMMARY = "Bundle a Python application and all its dependencies into a single package"
DESCRIPTION = "PyInstaller bundles a Python application and all its dependencies into a single \
package. The user can run the packaged app without installing a Python \
interpreter or any modules."
LICENSE = "GPL-2.0-only"

PV = "5.6.2"

RPM_NAME = "python39-PyInstaller-5.6.2-2.1.aarch64.rpm"
RPM_HASH = "c14266d35f0b167deb27c396e00e28aac8453a1052b1979e51537045829db1a6d23334c58f687b13154a262a6a8e218a0843852b9bffc1fb9c5fce8df4c10bb3"

RPROVIDES:${PN} += "python3.9dist(pyinstaller) \
python39-PyInstaller \
python39-PyInstaller(aarch-64) \
python3dist(pyinstaller)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit) \
python(abi) \
python39-devel \
python39-macholib \
python39-pefile \
python39-setuptools \
update-alternatives"

inherit rpm
