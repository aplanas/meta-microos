SUMMARY = "LSC Algorithm Pulsar Library"
DESCRIPTION = "The LSC Algorithm Pulsar Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "python39-lalpulsar-5.0.0-1.3.aarch64.rpm"
RPM_HASH = "6432cf92bf6cd2f746b08ebaccb3b439d01381d634b14e86a36b862cdbd8013f1010aefe03616f76e24e1c74bd0268d144841a22a3c297b399727a28134c524f"

RPROVIDES:${PN} += "python39-lalpulsar \
python39-lalpulsar(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgsl.so.25()(64bit) \
liblal.so.20()(64bit) \
liblalpulsar.so.26()(64bit) \
liblalsupport.so.14()(64bit) \
python(abi) \
python39-lal \
python39-lalframe \
python39-lalinference \
python39-lalsimulation \
python39-numpy"

inherit rpm
