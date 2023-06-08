SUMMARY = "Extended osip2 library"
DESCRIPTION = "Extended library for the osip2 protocol."
LICENSE = "GPL-2.0-or-later"

PV = "5.3.0"

RPM_NAME = "libeXosip2-devel-5.3.0-1.3.aarch64.rpm"
RPM_HASH = "f179d2e3c31c88ca9c28e5435c321ea7acad3500c8cbaabb04be631524f5e12fd605d48633ccc9db03682d35e1baa7416702bbef9029a6485378f4769088669a"

RPROVIDES:${PN} += "libeXosip2-15-devel libeXosip2-devel libeXosip2-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libeXosip2-15 libosip2-devel openssl-devel"

inherit rpm
