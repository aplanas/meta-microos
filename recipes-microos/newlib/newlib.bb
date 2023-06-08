SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.3.0.20230120"

RPM_NAME = "newlib-4.3.0.20230120-1.1.noarch.rpm"
RPM_HASH = "ef7bdbdf23e723343fdda7cac06d36d249f6829436fc61566ccc131cd0f86ad53124a9cdb7bd55da7bbf10852ac96fc4e4cdb480dd2b45c2291ea3900e0c4333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "newlib"
RDEPENDS:${PN} += ""

inherit rpm
