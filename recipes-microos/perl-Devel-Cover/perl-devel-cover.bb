SUMMARY = "Code coverage metrics for Perl"
DESCRIPTION = "This module provides code coverage metrics for Perl. Code coverage metrics \
describe how thoroughly tests exercise code. By using Devel::Cover you can \
discover areas of code not exercised by your tests and determine which \
tests to create to increase coverage. Code coverage can be considered an \
indirect measure of quality. \
 \
Devel::Cover is now quite stable and provides many of the features to be \
expected in a useful coverage tool. \
 \
Statement, branch, condition, subroutine, and pod coverage information is \
reported. Statement and subroutine coverage data should be accurate. Branch \
and condition coverage data should be mostly accurate too, although not \
always what one might initially expect. Pod coverage comes from \
Pod::Coverage. If Pod::Coverage::CountParents is available it will be used \
instead. \
 \
The _cover_ program can be used to generate coverage reports. Devel::Cover \
ships with a number of reports including various types of HTML output, \
textual reports, a report to display missing coverage in the same format as \
compilation errors and a report to display coverage information within the \
Vim editor. \
 \
It is possible to add annotations to reports, for example you can add a \
column to an HTML report showing who last changed a line, as determined by \
git blame. Some annotation modules are shipped with Devel::Cover and you \
can easily create your own. \
 \
The _gcov2perl_ program can be used to convert gcov files to 'Devel::Cover' \
databases. This allows you to display your C or XS code coverage together \
with your Perl coverage, or to use any of the Devel::Cover reports to \
display your C coverage data. \
 \
Code coverage data are collected by replacing perl ops with functions which \
count how many times the ops are executed. These data are then mapped back \
to reality using the B compiler modules. There is also a statement \
profiling facility which should not be relied on. For proper profiling use \
Devel::NYTProf. Previous versions of Devel::Cover collected coverage data \
by replacing perl's runops function. It is still possible to switch to that \
mode of operation, but this now gets little testing and will probably be \
removed soon. You probably don't care about any of this. \
 \
The most appropriate mailing list on which to discuss this module would be \
perl-qa. See http://lists.perl.org/list/perl-qa.html. \
 \
The Devel::Cover repository can be found at \
http://github.com/pjcj/Devel--Cover. This is also where problems should be \
reported."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.40"

RPM_NAME = "perl-Devel-Cover-1.40-1.1.aarch64.rpm"
RPM_HASH = "4b4b688788d4f64e32a30c1306610dae2495c54b3c7ab0bbbea9048ae09ac212aac69094cd4564f0538111ed6c733e4ddf07d72d00b4f9e98cc2a571adedb65e"

RPROVIDES:${PN} += "perl(Devel::Cover) perl(Devel::Cover::Annotation::Git) perl(Devel::Cover::Annotation::Random) perl(Devel::Cover::Annotation::Svk) perl(Devel::Cover::Branch) perl(Devel::Cover::Collection) perl(Devel::Cover::Collection::Template::Provider) perl(Devel::Cover::Condition) perl(Devel::Cover::Condition_and_2) perl(Devel::Cover::Condition_and_3) perl(Devel::Cover::Condition_or_2) perl(Devel::Cover::Condition_or_3) perl(Devel::Cover::Condition_xor_4) perl(Devel::Cover::Criterion) perl(Devel::Cover::DB) perl(Devel::Cover::DB::Criterion) perl(Devel::Cover::DB::Digests) perl(Devel::Cover::DB::File) perl(Devel::Cover::DB::IO) perl(Devel::Cover::DB::IO::Base) perl(Devel::Cover::DB::IO::JSON) perl(Devel::Cover::DB::IO::Sereal) perl(Devel::Cover::DB::IO::Storable) perl(Devel::Cover::DB::Run) perl(Devel::Cover::DB::Structure) perl(Devel::Cover::Html_Common) perl(Devel::Cover::Inc) perl(Devel::Cover::Op) perl(Devel::Cover::Pod) perl(Devel::Cover::Report::Compilation) perl(Devel::Cover::Report::Html) perl(Devel::Cover::Report::Html_basic) perl(Devel::Cover::Report::Html_basic::Template::Provider) perl(Devel::Cover::Report::Html_minimal) perl(Devel::Cover::Report::Html_subtle) perl(Devel::Cover::Report::Html_subtle::Template::Provider) perl(Devel::Cover::Report::Json) perl(Devel::Cover::Report::Sort) perl(Devel::Cover::Report::Text) perl(Devel::Cover::Report::Text2) perl(Devel::Cover::Report::Vim) perl(Devel::Cover::Report::Vim::Template::Provider) perl(Devel::Cover::Statement) perl(Devel::Cover::Subroutine) perl(Devel::Cover::Test) perl(Devel::Cover::Time) perl(Devel::Cover::Truth_Table) perl(Devel::Cover::Truth_Table::Row) perl(Devel::Cover::Util) perl(Devel::Cover::Web) perl-Devel-Cover perl-Devel-Cover(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0) perl(HTML::Entities) perl-B-Debug"

inherit rpm
