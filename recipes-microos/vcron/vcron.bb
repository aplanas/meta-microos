SUMMARY = "TK-Interface for cron and at"
DESCRIPTION = "TK-Interface for cron and at. \
 \
 \
 \
Authors: \
-------- \
    Daniel Roche <dan@lectra.com>"
LICENSE = "GPL-2.0+"

PV = "2.3"

RPM_NAME = "vcron-2.3-281.16.noarch.rpm"
RPM_HASH = "bc204b144fa4ac165ac21bbd92e66a7e5abf09f78e241458868999d57afcd3ae1f6aae98dace771d06b6add35351b353d0463facccf348cfbe39c90cd1bb3c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vcron"
RDEPENDS:${PN} += "/bin/sh at cron freetype2 tcl tk"

inherit rpm
