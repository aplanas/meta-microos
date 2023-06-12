SUMMARY = "Static libraries for performance tools for C++"
DESCRIPTION = "The gperftools-devel-static package contains static libraries for developing \
applications that use the gperftools package."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "gperftools-devel-static-2.10-1.5.aarch64.rpm"
RPM_HASH = "32b649a38523d67eb96fb6c81de858138c7e6d625c1cfc115696aeca74cc247d364eec7913570f09fc856eecfc177252ae7eb7e648440128fa9a8ffa3038f0c7"

RPROVIDES:${PN} += "gperftools-devel-static \
gperftools-devel-static(aarch-64)"
RDEPENDS:${PN} += "gperftools-devel"

inherit rpm
