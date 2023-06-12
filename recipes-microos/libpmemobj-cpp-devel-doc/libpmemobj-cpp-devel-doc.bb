SUMMARY = "Example C++ programs for libpmemobj++"
DESCRIPTION = "Example C++ programs (with source) on how to use libpmemobj++."
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "libpmemobj-cpp-devel-doc-1.13.0-1.5.aarch64.rpm"
RPM_HASH = "65c721c78f1b64ca78418984044c95185142de4478d7ae31223b0dabb82be1a5d2dd53e80ad3c9a42d068f13f664ceb04bd217b97ea90d855b8bd76f1ede3a78"

RPROVIDES:${PN} += "libpmemobj-cpp-devel-doc \
libpmemobj-cpp-devel-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
