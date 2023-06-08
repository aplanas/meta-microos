SUMMARY = "Access the terminfo database"
DESCRIPTION = "Objects in this class provide access to _terminfo_ database entires. \
 \
This database provides information about a terminal, in three separate sets \
of capabilities. Flag capabilities indicate the presence of a particular \
ability, feature, or bug simply by their presence. Number capabilities give \
the size, count or other numeric detail of some feature of the terminal. \
String capabilities are usually control strings that the terminal will \
recognise, or send. \
 \
Capabilities each have two names; a short name called the capname, and a \
longer name called the varname. This class provides two sets of methods, \
one that works on capnames, one that work on varnames. \
 \
This module optionally uses _unibilium_ to access the terminfo(5) database, \
if it is available at compile-time. If not, it will use _<term.h>_ and \
_-lcurses_. For more detail, see the SEE ALSO section below."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Term-Terminfo-0.09-1.13.aarch64.rpm"
RPM_HASH = "822cfaea6e403a47ba8f9c5eb680f56859580079dbf7d19aa2ee34a90ae2298ff6b49a037544d3b079b0979fb10ba9ff3535b912882b398172c65d2d08587c1f"

RPROVIDES:${PN} += "perl(Term::Terminfo) perl-Term-Terminfo perl-Term-Terminfo(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
