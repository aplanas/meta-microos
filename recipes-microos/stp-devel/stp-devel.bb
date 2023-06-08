SUMMARY = "Devel files for stp"
DESCRIPTION = "Developmnet files for stp library."
LICENSE = "MIT"

PV = "2.3.3+20220915"

RPM_NAME = "stp-devel-2.3.3+20220915-1.3.aarch64.rpm"
RPM_HASH = "85eec351808c5fb50420dda9aba3bfd54c3d120043c8fdcff255b1aec5c9a8659db4c0ab63933b85201da9fbe7793e14f15708714f34a1b4cc75a16f161e5a21"

RPROVIDES:${PN} += "cmake(STP) stp-devel stp-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_program_options-devel libstp2_3 minisat-devel stp"

inherit rpm
