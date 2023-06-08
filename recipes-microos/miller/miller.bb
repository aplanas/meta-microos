SUMMARY = "Name-indexed data processing tool"
DESCRIPTION = "Miller (mlr) allows name-indexed data such as CSV and JSON files to be \
processed with functions equivalent to sed, awk, cut, join, sort etc. It can \
convert between formats, preserves headers when sorting or reversing, and \
streams data where possible so its memory requirements stay small. It works \
well with pipes and can feed 'tail -f'."
LICENSE = "BSD-2-Clause & BSD-4-Clause"

PV = "6.7.0+git20230328.dc14420f"

RPM_NAME = "miller-6.7.0+git20230328.dc14420f-1.1.aarch64.rpm"
RPM_HASH = "ad6f05b51bf5c315eef218eb97a603977b7a182bf5ba90f8f59234ca85863b246113274b87f42e063e83bde6f0caf76cd364fc0a1001904a337d97a4a8b78866"

RPROVIDES:${PN} += "miller miller(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
