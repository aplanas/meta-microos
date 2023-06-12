SUMMARY = "Get a public suffix for a domain name using the Public Suffix List"
DESCRIPTION = "Get a public suffix for a domain name using the Public Suffix List. \
Forked from and using the same API as the publicsuffix package."
LICENSE = "MIT & MPL-2.0"

PV = "2.20191221"

RPM_NAME = "python311-publicsuffix2-2.20191221-1.13.noarch.rpm"
RPM_HASH = "e1d535ee2c3e9298627aa4e74f3dbf85a16190e7bdd7a9f80f6b80628f3312649d28effdc6aeab229c40cd86064bd8c3b84a4de890677c480d2504e4c08dc8cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(publicsuffix2) \
python311-publicsuffix2 \
python3dist(publicsuffix2)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
