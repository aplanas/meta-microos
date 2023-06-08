SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "OpenSSL"

PV = "1.1.1t"

RPM_NAME = "openssl-1_1-doc-1.1.1t-3.1.noarch.rpm"
RPM_HASH = "80952f4342f25a5b49a4d5de529f072dcebfd2e209bc4ef3cf91bb7c60434ba55c8eb96f7343edc563f8b296fb552f355910aac081ee818178cf4f91261ae935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl-1_1-doc openssl-doc"
RDEPENDS:${PN} += ""

inherit rpm
