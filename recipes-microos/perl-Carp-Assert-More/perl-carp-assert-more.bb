SUMMARY = "Convenience assertions for common situations"
DESCRIPTION = "Carp::Assert::More is a convenient set of assertions to make the habit of \
writing assertions even easier. \
 \
Everything in here is effectively syntactic sugar. There's no technical \
difference between calling one of these functions: \
 \
    assert_datetime( $foo ); \
    assert_isa( $foo, 'DateTime' ); \
 \
that are provided by Carp::Assert::More and calling these assertions from \
Carp::Assert \
 \
    assert( defined $foo ); \
    assert( ref($foo) eq 'DateTime' ); \
 \
My intent here is to make common assertions easy so that we as programmers \
have no excuse to not use them."
LICENSE = "Artistic-2.0"

PV = "2.2.0"

RPM_NAME = "perl-Carp-Assert-More-2.2.0-1.1.noarch.rpm"
RPM_HASH = "4d4b43f5f2e2509e21660707aead16231ff75b52c022b49795008daf0b662e1874ba48c74da343ac56524b336f6c2cccc0460a3a959a0502eb5cd8d2a11399a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Carp::Assert::More) perl-Carp-Assert-More"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Test::Exception)"

inherit rpm
