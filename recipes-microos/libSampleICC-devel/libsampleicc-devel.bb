SUMMARY = "Headers, Configuration and static Libs + Documentation"
DESCRIPTION = "Header files, libraries and documentation for development of Color Management \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "libSampleICC-devel-1.6.8-4.8.aarch64.rpm"
RPM_HASH = "d8ccc407222faac2bc588162ac40a025695b03c488af7f8c9776ce6425e63895f8b817c8f5791ab43181d6b0b1a12a77a1ff776378de6763ad09a6faf64c9e1a"

RPROVIDES:${PN} += "libSampleICC-devel libSampleICC-devel(aarch-64) pkgconfig(sampleicc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libSampleICC2"

inherit rpm
