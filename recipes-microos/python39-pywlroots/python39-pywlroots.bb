SUMMARY = "Python binding to the wlroots library using cffi"
DESCRIPTION = "Python binding to the wlroots library using cffi."
LICENSE = "NCSA"

PV = "0.16.4"

RPM_NAME = "python39-pywlroots-0.16.4-1.1.aarch64.rpm"
RPM_HASH = "f91afc7d0eb6bb2726410a5ace3813997636bee1149dd1ef9198d5b04e6ba4b86e22edb376c37e1b7367e52091804c5be764bfc3dbc38e4a3551f6df749d76c9"

RPROVIDES:${PN} += "python3.9dist(pywlroots) \
python39-pywlroots \
python39-pywlroots(aarch-64) \
python3dist(pywlroots)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libwlroots.so.11()(64bit) \
python(abi) \
python39-pywayland \
python39-xkbcommon"

inherit rpm
