SUMMARY = "Testing tools for Alien modules for projects that use C++"
DESCRIPTION = "This module works exactly like Test::Alien except that it supports C++. All \
functions like 'alien_ok', etc that are exported by Test::Alien are \
exported by this module. The only difference is that 'xs_ok' injects C++ \
support before delegating to Test::Alien."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.03"

RPM_NAME = "perl-Test-Alien-CPP-1.03-1.3.noarch.rpm"
RPM_HASH = "9fbd11b008aa863787ca9af5f662ea72967fd20d5d5fd5969ed6089357ab7cbaf432ac48bbc11d2cd82729e593bd965bf059251610244d4bff49636f972b9a4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Alien::CPP) perl(Test::Alien::CanCompileCpp) perl-Test-Alien-CPP"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(ExtUtils::CBuilder) perl(ExtUtils::CppGuess) perl(Test2::Require) perl(Test::Alien) perl(Test::Alien::Build)"

inherit rpm
