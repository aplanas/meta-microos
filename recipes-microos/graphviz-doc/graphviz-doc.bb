SUMMARY = "Documentation for graphviz"
DESCRIPTION = "Provides some additional PDF and HTML documentation for graphviz."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-doc-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "61167b3fb78206cb2ed0d90c0636091a0e7eca440a7af11a91ad0b9456e3925c58c34273c4530532ca1b62f3e5fa37f14ec0805adc33cb9ec8a4a5edd17e9928"

RPROVIDES:${PN} += "graphviz-doc graphviz-doc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env /usr/bin/lua5.1 /usr/bin/perl /usr/bin/php /usr/bin/ruby /usr/bin/tclsh"

inherit rpm
