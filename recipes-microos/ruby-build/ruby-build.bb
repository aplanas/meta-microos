SUMMARY = "Compile and install Ruby"
DESCRIPTION = "ruby-build provides a simple way to compile and install different versions of Ruby on UNIX-like systems."
LICENSE = "MIT"

PV = "20230428"

RPM_NAME = "ruby-build-20230428-1.1.noarch.rpm"
RPM_HASH = "6c30a5c962b6bf8b128c7ee1de66fa5a3fb05281240565fb7b61270c614be0036cfdb5bba8fe15b7163ca2c7f42ffd89afcc8704c8e564ce3506d0a7c2d42383"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build"
RDEPENDS:${PN} += "/bin/bash bash curl gzip make tar"

inherit rpm
