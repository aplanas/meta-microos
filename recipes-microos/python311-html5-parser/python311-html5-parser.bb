SUMMARY = "C based HTML 5 parsing for Python"
DESCRIPTION = "A standards compliant, C based HTML 5 parser for Python. It processes HTML \
about thirty times faster than the 'html5lib' pure Python based parser."
LICENSE = "Apache-2.0"

PV = "0.4.10"

RPM_NAME = "python311-html5-parser-0.4.10-2.10.aarch64.rpm"
RPM_HASH = "36c3aedcaf9c61f1c9c96f758a77d42d2e81b94f248ce9746e42d96444de551dd6c29717fb93e35d9fb16e17a56f9c4b3c9dd5dad6b8aa83b0d7a325a25e401a"

RPROVIDES:${PN} += "python3.11dist(html5-parser) \
python311-html5-parser \
python311-html5-parser(aarch-64) \
python3dist(html5-parser)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
python(abi)"

inherit rpm
