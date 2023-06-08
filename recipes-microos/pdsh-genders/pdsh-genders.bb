SUMMARY = "Genders plugin for pdsh"
DESCRIPTION = "Plugin for pdsh to determine nodes to run on by genders attributes."
LICENSE = "GPL-2.0-or-later"

PV = "2.34"

RPM_NAME = "pdsh-genders-2.34-10.2.aarch64.rpm"
RPM_HASH = "eacdae856da756cc40a81cd12b4c06b338b0cb3e078a8fead13cfe76afc18438b123acbace4fa7f521cce97f933fe4ba825493d4d151ad7e995cba204c71f801"

RPROVIDES:${PN} += "pdsh-genders pdsh-genders(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgenders.so.0()(64bit) pdsh"

inherit rpm
