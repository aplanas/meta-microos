SUMMARY = "Development files for sql-parser"
DESCRIPTION = "A SQL Parser for C++. It parses the given SQL query into C++ objects. It has \
been developed for integration in Hyrise, but can be used perfectly well in \
other environments as well. \
 \
This package contains development files for sql-parser."
LICENSE = "MIT"

PV = "1.5+git20181206"

RPM_NAME = "sql-parser-devel-1.5+git20181206-2.12.aarch64.rpm"
RPM_HASH = "7703d3dd1ca69f4d5102ededa163758119401be7911aaf54c80f16bb80d62f65519d1e0a75a5a725f91a008502db8566dd4e4f9fb1c71190b2292a9105e5d702"

RPROVIDES:${PN} += "sql-parser-devel sql-parser-devel(aarch-64)"
RDEPENDS:${PN} += "libsqlparser1"

inherit rpm
