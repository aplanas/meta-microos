SUMMARY = "Trap exit codes, exceptions, output, etc"
DESCRIPTION = "Primarily (but not exclusively) for use in test scripts: A block eval on \
steroids, configurable and extensible, but by default trapping (Perl) \
STDOUT, STDERR, warnings, exceptions, would-be exit codes, and return \
values from boxed blocks of test code. \
 \
The values collected by the latest trap can then be queried or tested \
through a special trap object."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.3.5"

RPM_NAME = "perl-Test-Trap-0.3.5-1.2.noarch.rpm"
RPM_HASH = "5346c098596b16b335082bf5f069455ed9446ce1dc78014f024b8f550b9edaaa90af91a1a8f88ce0a16574f51bddd2e81754483db6de23567183803db903881a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Trap) perl(Test::Trap::Builder) perl(Test::Trap::Builder::PerlIO) perl(Test::Trap::Builder::SystemSafe) perl(Test::Trap::Builder::TempFile) perl-Test-Trap"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Data::Dump) perl(Test::Tester) perl(version)"

inherit rpm
