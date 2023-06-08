SUMMARY = "Milter unit test utility"
DESCRIPTION = "Simulates the MTA side of an MTA-milter interaction for testing a milter-aware \
filter application.  It takes as input a script using the Lua language, \
and by exporting some utility functions, makes it possible for users to \
write scripts that exercise a filter."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "miltertest-1.6.0-7.15.aarch64.rpm"
RPM_HASH = "cb6a4b29350202eb5cdd1372653e6be4d192f1d241d15d2b735d447b04caba4da7bae5c5372151c414301aa82a3420d34b0e03756c18e41d3110711605cd0355"

RPROVIDES:${PN} += "miltertest miltertest(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbsd.so.0()(64bit) libbsd.so.0(LIBBSD_0.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblua5.1.so.5()(64bit)"

inherit rpm
