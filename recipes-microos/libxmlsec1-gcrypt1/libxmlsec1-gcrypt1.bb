SUMMARY = "GCrypt crypto plugin for XML Security Library"
DESCRIPTION = "GCrypt plugin for XML Security Library provides GCrypt based crypto services \
for the xmlsec library."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "libxmlsec1-gcrypt1-1.2.37-2.2.aarch64.rpm"
RPM_HASH = "47edf4c5bd6b04e014d4a6ded7e31e9ff2b669db1877719a8f49b93e1d474577008b501cd44e68165006524e52be4ff0ad144179be0ddef3adb22a821691ef3e"

RPROVIDES:${PN} += "libxmlsec1-gcrypt.so.1()(64bit) libxmlsec1-gcrypt1 libxmlsec1-gcrypt1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxmlsec1-1 libxmlsec1.so.1()(64bit)"

inherit rpm
