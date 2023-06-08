SUMMARY = "More sensible way to change directories"
DESCRIPTION = "Perl's 'chdir()' has the unfortunate problem of being very, very, very \
global. If any part of your program calls 'chdir()' or if any library you \
use calls 'chdir()', it changes the current working directory for the \
*whole* program. \
 \
This sucks. \
 \
File::chdir gives you an alternative, '$CWD' and '@CWD'. These two \
variables combine all the power of 'chdir()', File::Spec and Cwd."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.1011"

RPM_NAME = "perl-File-chdir-0.1011-1.10.noarch.rpm"
RPM_HASH = "77b3ef652f1d4e9c162a34a6336be468ddf2348d476ee39bd818ff249f3a9ed9a6ee0b21e80869c90548302727463b8dedbc720dba135940cafc80e3df47fa2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::chdir) perl(File::chdir::ARRAY) perl(File::chdir::SCALAR) perl-File-chdir"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Cwd) perl(File::Spec::Functions)"

inherit rpm
