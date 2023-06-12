SUMMARY = "Test your SYNOPSIS code"
DESCRIPTION = "Test::Synopsis is an (author) test module to find .pm or .pod files under \
your _lib_ directory and then make sure the example snippet code in your \
_SYNOPSIS_ section passes the perl compile check. \
 \
Note that this module only checks the perl syntax (by wrapping the code \
with 'sub') and doesn't actually run the code, *UNLESS* that code is a \
'BEGIN {}' block or a 'use' statement. \
 \
Suppose you have the following POD in your module. \
 \
  =head1 NAME \
 \
  Awesome::Template - My awesome template \
 \
  =head1 SYNOPSIS \
 \
    use Awesome::Template; \
 \
    my $template = Awesome::Template->new; \
    $tempalte->render('template.at'); \
 \
  =head1 DESCRIPTION \
 \
An user of your module would try copy-paste this synopsis code and find \
that this code doesn't compile because there's a typo in your variable name \
_$tempalte_. Test::Synopsis will catch that error before you ship it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.17"

RPM_NAME = "perl-Test-Synopsis-0.17-1.7.noarch.rpm"
RPM_HASH = "3bb03efe00558d599612d6c84e536daa715665e27dbaf31d867642b5ef339f3a97bebfca3e2927dae64697a03ac2af266456dc4bd5210822875b83182bbf321b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Synopsis) \
perl-Test-Synopsis"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Pod::Simple) \
perl(parent)"

inherit rpm
