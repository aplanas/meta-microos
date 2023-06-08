SUMMARY = "Dependency-reduced version of XMvn"
DESCRIPTION = "This package provides minimal version of XMvn, incapable of using \
remote repositories."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-minimal-4.2.0-2.1.aarch64.rpm"
RPM_HASH = "0a2383e42fbbd36771fae0396c2ac0d1d4af276d0d163aecdfcf3ad6f771edbd1be3f4079e2ffc04a88bc54e36723ca7794e64660d72da33f518269067a739dc"

RPROVIDES:${PN} += "libjansi.so()(64bit) xmvn-minimal xmvn-minimal(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit) maven-lib xmvn-api xmvn-connector xmvn-core"

inherit rpm
