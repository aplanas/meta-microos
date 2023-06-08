SUMMARY = "Libraries of Just-In-Time compiler for Lua"
DESCRIPTION = "This package includes the LuaJIT development files. \
LuaJIT is a Just-In-Time (JIT) compiler for the Lua programming language"
LICENSE = "MIT"

PV = "2.1.0beta3"

RPM_NAME = "texlive-texluajit-devel-2.1.0beta3-89.1.aarch64.rpm"
RPM_HASH = "35f85ef0986f819e84d1bb8c2eba0ee4e6e70ef9db46d9c42a642276c315cca465bca0392a210eeb44283613cb171f89b1d982695021160d4637f9f527876b73"

RPROVIDES:${PN} += "pkgconfig(texluajit) texlive-texluajit-devel texlive-texluajit-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libtexlua53-5"

inherit rpm
