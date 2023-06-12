SUMMARY = "Python digital signal processing module"
DESCRIPTION = "PYO is a Python module written in C to help digital signal processing \
script creation."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.3"

RPM_NAME = "python311-pyo-1.0.3-1.13.aarch64.rpm"
RPM_HASH = "91ad1ab213bb96fef17afaeedc06616d93344ba3771cc2f12fad163f4a16f5f74d19528db80d82d7467efd096880105127727e70ce33d0f6a884f5ae927b66e4"

RPROVIDES:${PN} += "python3.11dist(pyo) \
python311-pyo \
python311-pyo(aarch-64) \
python3dist(pyo)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjack.so.0()(64bit) \
liblo.so.7()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libportaudio.so.2()(64bit) \
libportmidi.so.2()(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
python(abi)"

inherit rpm
