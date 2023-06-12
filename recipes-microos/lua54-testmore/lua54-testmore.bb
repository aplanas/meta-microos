SUMMARY = "A Lua port of the Perl Test::More unit testing framework"
DESCRIPTION = "lua-TestMore is a port of the Perl5 module Test::More. It uses the \
Test Anything Protocol as output, that allows a compatibility with \
the Perl QA ecosystem. It's an extensible framework. \
See lua-TestAssertion an extension which provides many Lua friendly \
assertions. It allows a simple and efficient way to write tests \
(without OO style). Some tests could be marked as TODO or skipped. \
Errors could be fully checked with error_like()."
LICENSE = "MIT"

PV = "0.3.6+git2"

RPM_NAME = "lua54-testmore-0.3.6+git2-2.1.noarch.rpm"
RPM_HASH = "31c4d764b0f06880408fa15314b71d1258b6ad893b9908a7ac11f5baad3dd34ac2a7fd840dcb3e8bfbb6bbf2ff1fdab6d3523edfaec01e489b3d032c0eb7ad8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-testmore \
lua54-testmore"
RDEPENDS:${PN} += "lua54"

inherit rpm
