SUMMARY = "Hardware health monitoring library"
DESCRIPTION = "libsensors offers a way for applications to access the hardware \
monitoring chips of the system. A system-dependent configuration file \
controls how the different inputs are labeled and what scaling factors \
have to be applied for the specific hardware, so that the output makes \
sense to the user."
LICENSE = "LGPL-2.1-or-later"

PV = "3.6.0"

RPM_NAME = "libsensors4-3.6.0-8.7.aarch64.rpm"
RPM_HASH = "891b528ae07d740ecf0f9a7d817af9e073195a95ba997ca110331275f6dc1bc30f77163766a00c6e5e820d6fd14cd3067587047afe18ef4ee680460ff13f9eec"

RPROVIDES:${PN} += "config(libsensors4) libsensors.so.4()(64bit) libsensors4 libsensors4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
