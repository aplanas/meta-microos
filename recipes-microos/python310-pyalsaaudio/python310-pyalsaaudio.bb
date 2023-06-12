SUMMARY = "ALSA bindings for Python"
DESCRIPTION = "This package contains wrappers for accessing the ALSA API from Python. \
It is fairly complete for PCM devices and Mixer access."
LICENSE = "Python-2.0"

PV = "0.10.0"

RPM_NAME = "python310-pyalsaaudio-0.10.0-1.1.aarch64.rpm"
RPM_HASH = "bee2de4ffcb67157ac8bbe5774017bac9b410c5c660b7ea043ab899c6ab62dd910ca2bc4add3ff22edee4dce5095e61cb0da397263c1ab21fb378e3a10ee6239"

RPROVIDES:${PN} += "python3-pyalsaaudio \
python3.10dist(pyalsaaudio) \
python310-pyalsaaudio \
python310-pyalsaaudio(aarch-64) \
python3dist(pyalsaaudio)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
