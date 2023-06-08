SUMMARY = "Nested JSON data to tabular data transformer"
DESCRIPTION = "Jt reads UTF-8 encoded JSON forms from stdin and writes tab separated \
values (or CSV) to stdout. A simple stack-based programming language \
is used to extract values from the JSON input for printing."
LICENSE = "EPL-1.0"

PV = "4.3.3"

RPM_NAME = "json-table-4.3.3-2.13.aarch64.rpm"
RPM_HASH = "c25500376bcaaa44b41d48e842424fa5ab1ba297e7f5bae7930d0ebc6f9922dbf5e4d86d7801f25a4fc0d991e1b995116399df9a972120ef9b20946c5919a4af"

RPROVIDES:${PN} += "json-table json-table(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
