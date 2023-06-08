SUMMARY = "Secure Erasure of Data"
DESCRIPTION = "Wipe is a tool that attempts to effectively degauses the surface of \
a hard disk, making it virtually impossible to retrieve the data \
that was stored on it. This tool is designed to make sure secure \
data that is erased from a hard drive is unrecoverable."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.1"

RPM_NAME = "wipe-2.3.1-18.9.aarch64.rpm"
RPM_HASH = "fb59765a16e38657f6b60953fcc9a1c1e872b81c88f634c4a9b8e088269ae11128c339e2cf5e87ddef7ea45b026417402bf78c213b6c7b5290a9470c1684aa7e"

RPROVIDES:${PN} += "wipe wipe(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
