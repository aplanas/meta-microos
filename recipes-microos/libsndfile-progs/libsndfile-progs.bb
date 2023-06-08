SUMMARY = "Example Programs for libsndfile"
DESCRIPTION = "This package includes the example programs for libsndfile."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "libsndfile-progs-1.2.0-2.1.aarch64.rpm"
RPM_HASH = "9a4070b93d977e590d4aeaa0142c563fe9d3a7690b2012e203c50ec958e1ac9d643a11ef78c9bf085ebcc5936ac864fe49a04c91db65d800567638065e8b318e"

RPROVIDES:${PN} += "libsndfile-progs libsndfile-progs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit)"

inherit rpm
