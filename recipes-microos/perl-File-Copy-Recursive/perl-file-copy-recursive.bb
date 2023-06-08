SUMMARY = "Perl extension for recursively copying files and directories"
DESCRIPTION = "This module copies and moves directories recursively (or single files, \
well... singley) to an optional depth and attempts to preserve each file or \
directory's mode."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.45"

RPM_NAME = "perl-File-Copy-Recursive-0.45-1.15.noarch.rpm"
RPM_HASH = "6ab293ed1afd708fa6ef1e2d05f2ac37da93b17671bb2a4bbd65be1fe3e72f69bb297eee57cad3259d600ec93eb8820f29bea4cde7a02d096d96ac1d7d122059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::Copy::Recursive) perl-File-Copy-Recursive"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
