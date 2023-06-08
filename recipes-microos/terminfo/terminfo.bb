SUMMARY = "A terminal descriptions database"
DESCRIPTION = "This is the terminfo reference database, maintained in the ncurses \
package. This database is the official successor to the 4.4BSD termcap \
file and contains information about any known terminal. The ncurses \
library makes use of this database to use terminals correctly. If you \
just use the Linux console, xterm, and VT100, you probably will not \
need this database -- a minimal /usr/share/terminfo tree for these \
terminals is already included in the terminfo-base package."
LICENSE = "SUSE-Public-Domain"

PV = "6.4.20230429"

RPM_NAME = "terminfo-6.4.20230429-11.1.aarch64.rpm"
RPM_HASH = "c382a9103ca3d6c1764153ecad9eccd84337811128220208b1ef03b6fcb269e2dc967c67a21f8f2782c0cd619cb95e5bc40d8e3f16b4027d9c85f0232d6140de"

RPROVIDES:${PN} += "terminfo terminfo(aarch-64)"
RDEPENDS:${PN} += "terminfo-base"

inherit rpm
