SUMMARY = "Assert that your Perl files compile OK"
DESCRIPTION = "'Test::Compile' lets you check the whether your perl modules and scripts \
compile properly, results are reported in standard 'Test::Simple' fashion. \
 \
The basic usage - as shown above, will locate your perl files and test that \
they all compile. \
 \
Module authors can (and probably should) include the following in a \
_t/00-compile.t_ file and have 'Test::Compile' automatically find and check \
all Perl files in a module distribution: \
 \
     \
    use strict; \
    use warnings; \
    use Test::Compile qw(); \
 \
    my $test = Test::Compile->new(); \
    $test->all_files_ok(); \
    $test->done_testing();"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.2.2"

RPM_NAME = "perl-Test-Compile-3.2.2-1.1.noarch.rpm"
RPM_HASH = "e3fd741b685c8439d821efb7284256253dbad568c735b80bc1a4e30d03f66687c2889a4f84f1de57efe094e91873b16579ac72e44912f06145aeab616798e02e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Compile) perl(Test::Compile::Internal) perl-Test-Compile"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Exporter) perl(parent)"

inherit rpm
