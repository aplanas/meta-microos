SUMMARY = "LSC Algorithm Inference Library"
DESCRIPTION = "The LSC Algorithm Inference Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.0"

RPM_NAME = "python39-lalinference-4.0.0-1.2.aarch64.rpm"
RPM_HASH = "ed568c859c2d95ea0b7316bffabb1986a992567d0931f7ed5a0e6220ed68955107b44001e57d9bf0c8c6a284e6a3a37e01b62525e83ce48e5e283ba3e13a1a89"

RPROVIDES:${PN} += "python39-lalinference python39-lalinference(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) liblal.so.20()(64bit) liblalinference.so.23()(64bit) liblalsupport.so.14()(64bit) python(abi) python39-lal python39-lalburst python39-lalframe python39-lalinference-data python39-lalinspiral python39-lalmetaio python39-lalsimulation"

inherit rpm
