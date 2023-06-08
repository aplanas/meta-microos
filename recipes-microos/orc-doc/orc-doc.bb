SUMMARY = "The Oil Runtime Compiler Library - Documentation"
DESCRIPTION = "Orc is a library and set of tools for compiling and executing very simple \
programs that operate on arrays of data.  The “language” is a generic \
assembly language that represents many of the features available in SIMD \
architectures, including saturated addition and subtraction, and many \
arithmetic operations."
LICENSE = "BSD-3-Clause"

PV = "0.4.33"

RPM_NAME = "orc-doc-0.4.33-1.3.aarch64.rpm"
RPM_HASH = "82ffb25ca5284f685ba585f53c39be195a56aecc57edc6bcd59906ac296430ef2f3ed2b2559ecd65c5ea7a22870c0dc691bf6513c022c05dbadd3d4286bb95e8"

RPROVIDES:${PN} += "orc-doc orc-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
