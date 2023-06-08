SUMMARY = "Virtual Machine for Scheme48"
DESCRIPTION = "A devel files for scheme48 and scheme48-prescheme. This includes a header files, \
libprescheme.so and scheme48-config."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "scheme48-devel-1.9.2-2.18.aarch64.rpm"
RPM_HASH = "57c26ed1ed7e54548dc1021dd9c40e02f4d6b95e939562aa3d5d373e9ca5097bb04d8ad4f2f13e7c2d884807554cb447877cf0a72c806f9fd2ad21efa6ef736d"

RPROVIDES:${PN} += "scheme48-devel scheme48-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/scheme-srfi-7 scheme48"

inherit rpm
