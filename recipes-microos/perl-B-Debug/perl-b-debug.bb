SUMMARY = "Walk Perl syntax tree, printing debug info about ops"
DESCRIPTION = "See _ext/B/README_ and the newer B::Concise."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.26"

RPM_NAME = "perl-B-Debug-1.26-1.16.noarch.rpm"
RPM_HASH = "059876dabcb386486844783518bf70b073094d4ee7d2ca6f1114571497601869f42dafcda9e631908be79d09b285a313267aff488791edf5083a24361ec9de8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(B::Debug) perl-B-Debug"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(deprecate)"

inherit rpm
