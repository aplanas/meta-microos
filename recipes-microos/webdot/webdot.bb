SUMMARY = "A CGI graph server script that uses tcldot from graphviz"
DESCRIPTION = "A cgi-bin program that produces clickable graphs in web pages when \
provided with an href to a .dot file.  Uses Tcldot from the graphviz \
rpm. By default, only requests from localhost are served."
LICENSE = "BSD-3-Clause"

PV = "2.30"

RPM_NAME = "webdot-2.30-4.8.noarch.rpm"
RPM_HASH = "fa736c68aab9fb6be0c8c8a41d989ca460856b1c65fde11422ffed109a0cea33b414308093438206fe39c85fbbfa31089d301bfff63f0da02a2ea0fc053187ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "webdot"
RDEPENDS:${PN} += "/usr/bin/tclsh filesystem fileutils ghostscript http_daemon"

inherit rpm
