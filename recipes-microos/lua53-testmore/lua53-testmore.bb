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

RPM_NAME = "lua53-testmore-0.3.6+git2-2.1.noarch.rpm"
RPM_HASH = "59a5ad26f2ff263b1146edb82ee88d24c6be136a3e6e34cec2b9be23168e294533b4844cd390009c67d2836a774c3081e4a5032e376c029e6ba192e153d52f69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-testmore"
RDEPENDS:${PN} += "lua53"

inherit rpm
