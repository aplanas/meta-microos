SUMMARY = "Perform diffs on files and record sets"
DESCRIPTION = "'diff()' provides a basic set of services akin to the GNU 'diff' utility. \
It is not anywhere near as feature complete as GNU 'diff', but it is better \
integrated with Perl and available on all platforms. It is often faster \
than shelling out to a system's 'diff' executable for small files, and \
generally slower on larger files. \
 \
Relies on Algorithm::Diff for, well, the algorithm. This may not produce \
the same exact diff as a system's local 'diff' executable, but it will be a \
valid diff and comprehensible by 'patch'. We haven't seen any differences \
between Algorithm::Diff's logic and GNU 'diff''s, but we have not examined \
them to make sure they are indeed identical. \
 \
*Note*: If you don't want to import the 'diff' function, do one of the \
following: \
 \
   use Text::Diff (); \
 \
   require Text::Diff; \
 \
That's a pretty rare occurrence, so 'diff()' is exported by default. \
 \
If you pass a filename, but the file can't be read, then 'diff()' will \
'croak'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.45"

RPM_NAME = "perl-Text-Diff-1.45-1.21.noarch.rpm"
RPM_HASH = "57840a951b6e75e3f5cc858bc47a8bec85e43a973b52a90dc3c77dced53fdcc9c6fd2b663f2be1506c6b60782cbf42a6bc59910520976836631c57af9138915b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Text::Diff) perl(Text::Diff::Base) perl(Text::Diff::Config) perl(Text::Diff::Table) perl-Text-Diff"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Algorithm::Diff)"

inherit rpm
