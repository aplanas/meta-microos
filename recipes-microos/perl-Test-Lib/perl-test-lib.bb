SUMMARY = "Use libraries from a t/lib directory"
DESCRIPTION = "Searches upward from the calling module for a directory _t_ with a _lib_ \
directory inside it, and adds it to the module search path. Looks upward up \
to 5 directories. This is intended to be used in test modules either \
directly in _t_ or in a subdirectory to find their included testing \
libraries located in _t/lib_."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.003"

RPM_NAME = "perl-Test-Lib-0.003-1.4.noarch.rpm"
RPM_HASH = "fbdfd712c5708702bbd1d45f84b93136bf2b9d83440492cb3ac5231fa910667b06703ba9ed9559ea3682bd649197e6b73c209f67f1fb606c67a577beaf813b2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Lib) perl-Test-Lib"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
