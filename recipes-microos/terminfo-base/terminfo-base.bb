SUMMARY = "A terminal descriptions database"
DESCRIPTION = "This is the terminfo basic database, maintained in the ncurses package. \
This database is the official successor to the 4.4BSD termcap file and \
contains information about any known terminal. The ncurses library \
makes use of this database to use terminals correctly."
LICENSE = "MIT"

PV = "6.4.20230429"

RPM_NAME = "terminfo-base-6.4.20230429-11.1.aarch64.rpm"
RPM_HASH = "aa71584870f130ce7c1a6848fadb4aa955be27e1f4e2e47b3109f022c57e37d4a16c08fdcf4f3e869f6fab4c0201390bcb67ca81b5ce1002e65708d0c8a99abb"

RPROVIDES:${PN} += "config(terminfo-base) ncurses:/usr/share/tabset terminfo-base terminfo-base(aarch-64)"
RDEPENDS:${PN} += "ncurses"

inherit rpm
