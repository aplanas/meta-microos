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

RPM_NAME = "lua51-testmore-0.3.6+git2-2.1.noarch.rpm"
RPM_HASH = "a6423f01004d81284614a1c5cef0cafeeae6fc6e477aca2561c1b81b3b4332adf014abd6f661a04e26055fc0d85e3a1c6900f4b415501ebeee2186e15d887306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-testmore"
RDEPENDS:${PN} += "lua51"

inherit rpm
