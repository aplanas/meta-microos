SUMMARY = "Print Server"
DESCRIPTION = "This pattern provides all packages necessary for printing. It provides all \
needed packages for printing to a locally connected printer, printing using a \
remote print server and for setting up a print server."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-printing-20210330-4.1.aarch64.rpm"
RPM_HASH = "4ebb3fbea19d0646d2631319d7bde46965e4eec0514846ca418d9b588ebf8b9a51b3f5c28091c50d47f2a7a904f9ebf18dccb5e751e98e3b11fdbeff51303757"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-openSUSE-print_server patterns-server-printing patterns-server-printing(aarch-64)"
RDEPENDS:${PN} += "cups pattern()"

inherit rpm
