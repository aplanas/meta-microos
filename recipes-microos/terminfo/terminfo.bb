SUMMARY = "A terminal descriptions database"
DESCRIPTION = "This is the terminfo reference database, maintained in the ncurses \
package. This database is the official successor to the 4.4BSD termcap \
file and contains information about any known terminal. The ncurses \
library makes use of this database to use terminals correctly. If you \
just use the Linux console, xterm, and VT100, you probably will not \
need this database -- a minimal /usr/share/terminfo tree for these \
terminals is already included in the terminfo-base package."
LICENSE = "SUSE-Public-Domain"

PV = "6.4.20230520"

RPM_NAME = "terminfo-6.4.20230520-13.1.aarch64.rpm"
RPM_HASH = "880c624c87d9f9ba67f62cbf919cf60327b8e0d93c4cfa886bfe10cf1e4b11ce71c4a9cd8ba8cc922487e36a48ca913b994dd0a5159047ce45b3ff55eb2606d4"

RPROVIDES:${PN} += "terminfo \
terminfo(aarch-64)"
RDEPENDS:${PN} += "terminfo-base"

inherit rpm
