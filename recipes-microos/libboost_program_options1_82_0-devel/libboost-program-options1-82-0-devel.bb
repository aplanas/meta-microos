SUMMARY = "Development headers for Boost.ProgramOptions library"
DESCRIPTION = "This package contains development headers for Boost.ProgramOptions \
library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_program_options1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "b02e852d9da1c19c3a76b62a11a8d97c4a428b122e2f09fdae6ce4d22476b7949bc859d03ee138818d14b267e133b20079a14a22a9dcf8f8aee5aa2a304ddf79"

RPROVIDES:${PN} += "libboost_program_options-devel-impl libboost_program_options1_82_0-devel libboost_program_options1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_headers1_82_0-devel libboost_program_options1_82_0"

inherit rpm
