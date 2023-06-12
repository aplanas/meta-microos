SUMMARY = "Command-line wrapper for git and GitHub"
DESCRIPTION = "hub is a command line tool that wraps git in order to extend it with \
extra features and commands that make working with GitHub easier."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "hub-2.14.2-1.18.aarch64.rpm"
RPM_HASH = "f79a2024d808a52a2c61e043338badebffd5fbefb6afe59a7acf1d38afb4e5098573c3b4d18097530f2527374fd94857a6d72b6d5cb2d93dcac6655ac261fe58"

RPROVIDES:${PN} += "hub hub(aarch-64) rubygem-hub"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
