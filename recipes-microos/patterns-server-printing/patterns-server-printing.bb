SUMMARY = "Print Server"
DESCRIPTION = "This pattern provides all packages necessary for printing. It provides all \
needed packages for printing to a locally connected printer, printing using a \
remote print server and for setting up a print server."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-printing-20210330-5.1.aarch64.rpm"
RPM_HASH = "d104e09568c4431fd2781f6841a569f82407dc96c3306d74a03c09f20a5d7068190e663a24384fd1e3db70a625f61e67f737f4d242d953bdb6d27164474439d8"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-openSUSE-print_server patterns-server-printing patterns-server-printing(aarch-64)"
RDEPENDS:${PN} += "cups pattern()"

inherit rpm
