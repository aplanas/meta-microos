SUMMARY = "Check for pod coverage in your distribution."
DESCRIPTION = "Test::Pod::Coverage is used to create a test for your distribution, to \
ensure that all relevant files in your distribution are appropriately \
documented in pod. \
 \
Can also be called with the Pod::Coverage manpage parms. \
 \
    use Test::Pod::Coverage tests=>1; \
    pod_coverage_ok( \
        'Foo::Bar', \
        { also_private => [ qr/^[A-Z_]+$/ ], }, \
        'Foo::Bar, with all-caps functions as privates', \
    ); \
 \
The the Pod::Coverage manpage parms are also useful for subclasses that \
don't re-document the parent class's methods. Here's an example from the \
Mail::SRS manpage. \
 \
    pod_coverage_ok( 'Mail::SRS' ); # No exceptions \
 \
     \
    my $trustme = { trustme => [qr/^(new|parse|compile)$/] }; \
    pod_coverage_ok( 'Mail::SRS::DB', $trustme ); \
    pod_coverage_ok( 'Mail::SRS::Guarded', $trustme ); \
    pod_coverage_ok( 'Mail::SRS::Reversable', $trustme ); \
    pod_coverage_ok( 'Mail::SRS::Shortcut', $trustme ); \
 \
Alternately, you could use the Pod::Coverage::CountParents manpage, which \
always allows a subclass to reimplement its parents' methods without \
redocumenting them. For example: \
 \
    my $trustparents = { coverage_class => 'Pod::Coverage::CountParents' }; \
    pod_coverage_ok( 'IO::Handle::Frayed', $trustparents ); \
 \
(The 'coverage_class' parameter is not passed to the coverage class with \
other parameters.) \
 \
If you want POD coverage for your module, but don't want to make \
Test::Pod::Coverage a prerequisite for installing, create the following as \
your _t/pod-coverage.t_ file: \
 \
    use Test::More; \
    eval 'use Test::Pod::Coverage'; \
    plan skip_all => 'Test::Pod::Coverage required for testing pod coverage' if $@; \
 \
    plan tests => 1; \
    pod_coverage_ok( 'Pod::Master::Html'); \
 \
Finally, Module authors can include the following in a _t/pod-coverage.t_ \
file and have 'Test::Pod::Coverage' automatically find and check all \
modules in the module distribution: \
 \
    use Test::More; \
    eval 'use Test::Pod::Coverage 1.00'; \
    plan skip_all => 'Test::Pod::Coverage 1.00 required for testing POD coverage' if $@; \
    all_pod_coverage_ok();"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.10"

RPM_NAME = "perl-Test-Pod-Coverage-1.10-3.26.noarch.rpm"
RPM_HASH = "acadb93ebf7603b0f6847888a1a5161d6833ce682599dd39e1ab98ccb9037014ada4f5d51da7e8abe3a3d37c7dda28c2e10766b61bc6f05385b0b5c68c394420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Pod::Coverage) perl-Test-Pod-Coverage"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Pod::Coverage)"

inherit rpm
