SUMMARY = "Command-line wrapper for git and GitHub"
DESCRIPTION = "hub is a command line tool that wraps git in order to extend it with \
extra features and commands that make working with GitHub easier."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "hub-2.14.2-1.17.aarch64.rpm"
RPM_HASH = "43df78b33f34c7b2ec6d8279191eecce888b45c1ef3428f0e39ee451b5b58fed7961bbcf7593a06211b6c41d808683843db1035001a1b0db412e6b7b218a9f43"

RPROVIDES:${PN} += "hub hub(aarch-64) rubygem-hub"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
