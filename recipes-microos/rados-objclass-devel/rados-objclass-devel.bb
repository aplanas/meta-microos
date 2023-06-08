SUMMARY = "RADOS object class development kit"
DESCRIPTION = "This package contains libraries and headers needed to develop RADOS object \
class plugins."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "rados-objclass-devel-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "c4d10a8956e21e4098321773444a451180eac35778ed7f80d8d581a9618c1b5b0ff9804fa3e99e5ee0a5f1e59225cad6d4f5790d1009a19a31365fc44c0e1e80"

RPROVIDES:${PN} += "rados-objclass-devel rados-objclass-devel(aarch-64)"
RDEPENDS:${PN} += "libradospp-devel"

inherit rpm
