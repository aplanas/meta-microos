SUMMARY = "Python unicodedata backport/updates"
DESCRIPTION = "Unicodedata backport and updates for the latest unicode version. \
The versions of this package match Unicode versions, so \
unicodedata2==15.0.0 is data from Unicode 15.0.0."
LICENSE = "Apache-2.0 & Python-2.0"

PV = "15.0.0"

RPM_NAME = "python310-unicodedata2-15.0.0-1.4.aarch64.rpm"
RPM_HASH = "1abac5341cf3e4e82b860fe4c42f9c7ff5320940c2a4e4f5fffaa36e5acbfc124a6c16df9a4272c1536a41c8141e57206efbb369df8bc20455863f560467beed"

RPROVIDES:${PN} += "python3-unicodedata2 \
python3.10dist(unicodedata2) \
python310-unicodedata2 \
python310-unicodedata2(aarch-64) \
python3dist(unicodedata2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
