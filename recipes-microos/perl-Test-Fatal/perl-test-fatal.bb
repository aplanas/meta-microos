SUMMARY = "Incredibly simple helpers for testing code with exceptions"
DESCRIPTION = "Test::Fatal is an alternative to the popular Test::Exception. It does much \
less, but should allow greater flexibility in testing exception-throwing \
code with about the same amount of typing. \
 \
It exports one routine by default: 'exception'. \
 \
*Achtung!* 'exception' intentionally does not manipulate the call stack. \
User-written test functions that use 'exception' must be careful to avoid \
false positives if exceptions use stack traces that show arguments. For a \
more magical approach involving globally overriding 'caller', see \
Test::Exception."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.017"

RPM_NAME = "perl-Test-Fatal-0.017-1.2.noarch.rpm"
RPM_HASH = "8d919984ee9d280d386359e6e7f5eacfb724009242c237a739504781cdc4ef14d6624f87d7e5f92c77f203a27b1bd9fabeb5935a93d1495942d3411b4e32977f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Fatal) perl-Test-Fatal"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Try::Tiny)"

inherit rpm
