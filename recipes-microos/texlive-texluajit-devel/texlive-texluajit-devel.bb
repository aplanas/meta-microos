SUMMARY = "Libraries of Just-In-Time compiler for Lua"
DESCRIPTION = "This package includes the LuaJIT development files. \
LuaJIT is a Just-In-Time (JIT) compiler for the Lua programming language"
LICENSE = "MIT"

PV = "2.1.0beta3"

RPM_NAME = "texlive-texluajit-devel-2.1.0beta3-91.1.aarch64.rpm"
RPM_HASH = "eab6243011dc6637ed5afa10b2021320d697c17438367988b78100ce31007ea01478102c14dab6a339ec75e5094d854e6cc1c5dc95b5c5ffe6469d9f0e8ee4ae"

RPROVIDES:${PN} += "pkgconfig(texluajit) texlive-texluajit-devel texlive-texluajit-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libtexlua53-5"

inherit rpm
