SUMMARY = "A DNS toolkit for Python"
DESCRIPTION = "dnspython is a DNS toolkit for Python. It supports almost all \
record types. It can be used for queries, zone transfers, and \
dynamic updates. It supports TSIG authenticated messages and EDNS0. \
 \
dnspython provides both high and low level access to DNS. The high \
level classes perform queries for data of a given name, type, and \
class, and return an answer set. The low level classes allow direct \
manipulation of DNS zones, messages, names, and records. \
 \
The package requires dependencies necessary for these optional features: \
- DNS over HTTPS (doh) \
- IDNA \
- DNSSEC \
and suggest dependencies necessary for these optional features: \
- trio \
- curio \
This optional feature is not available due to missing dependencies: \
- wmi"
LICENSE = "ISC"

PV = "2.3.0"

RPM_NAME = "python310-dnspython-2.3.0-2.1.noarch.rpm"
RPM_HASH = "edafb4d1809759ced009672694c29004ead8a0b6e97f7b11553979742f4f827e6fd39f9ea45dc1df8614db1235ec9cbdac1e8ea222b8e60bb875db6626aabec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dnspython \
python3.10dist(dnspython) \
python310-dnspython \
python3dist(dnspython)"
RDEPENDS:${PN} += "python(abi) \
python310-cryptography \
python310-httpx \
python310-idna \
python310-requests \
python310-requests-toolbelt"

inherit rpm
