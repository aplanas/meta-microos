SUMMARY = "Header files for picojson development"
DESCRIPTION = "PicoJSON is a tiny JSON parser / serializer for C++. It is implemented as \
header-only, has no external dependencies, is STL-friendly (using std::vector \
and std::map only), and provides both streaming (event-based) and a pull \
interface. \
This package provides the picojson header file(s)."
LICENSE = "BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "picojson-devel-1.3.0-1.18.aarch64.rpm"
RPM_HASH = "c3b8a1577e8819d8c08275fca91f782cec717862378cacfe9962d67a95b05386d06d9b7726da83af26782add47e71c2bd65487476376a0355cbc1731b48f8089"

RPROVIDES:${PN} += "picojson-devel picojson-devel(aarch-64) picojson-static"
RDEPENDS:${PN} += ""

inherit rpm
