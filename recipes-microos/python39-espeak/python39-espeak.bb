SUMMARY = "Python bindings for espeak"
DESCRIPTION = "Python bindings for the eSpeak speech synthesizer."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "python39-espeak-0.5-5.24.aarch64.rpm"
RPM_HASH = "5a60db9ba594ca8ccd2495e5dcb01067b6ea46e77724cd6ea2a26ade6b3338c9a8cb8caa32e9af43e5daa8e3aa5745baf882e5deb4db27bba3d3e036ca6ecf12"

RPROVIDES:${PN} += "python3.9dist(python-espeak) python39-espeak python39-espeak(aarch-64) python3dist(python-espeak)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libespeak.so.1()(64bit) python(abi)"

inherit rpm
