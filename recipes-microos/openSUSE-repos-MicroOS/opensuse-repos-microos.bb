SUMMARY = "openSUSE package repositories"
DESCRIPTION = "Definitions for openSUSE repository management via zypp-services"
LICENSE = "MIT"

PV = "20230209.87a5e9e"

RPM_NAME = "openSUSE-repos-MicroOS-20230209.87a5e9e-1.1.aarch64.rpm"
RPM_HASH = "ca2a9c7c0b03012de71c7d9249b7a56f4e34289920ebe2dc3bf737e8bf6608cf5c85664e244494bd65d8d31fa6fb5ce87fbfbc7aea233b3b89a0be3eadf5f482"

RPROVIDES:${PN} += "openSUSE-repos \
openSUSE-repos-MicroOS \
openSUSE-repos-MicroOS(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
zypper"

inherit rpm
