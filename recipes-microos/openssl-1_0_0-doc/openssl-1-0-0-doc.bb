SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "openssl-1_0_0-doc-1.0.2u-15.1.noarch.rpm"
RPM_HASH = "b8b6dba70f0c5756a1452a4ea34a320d1788122d343aa82df4b078a8e24d6412dcfdd61977d86bff98ea9713e3ac8722ff36e5fa666d93c252b7cb3c09a94d15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl-1_0_0-doc openssl-doc"
RDEPENDS:${PN} += ""

inherit rpm
