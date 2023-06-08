SUMMARY = "Meta package for dependencies to build TruffleRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build TruffleRuby."
LICENSE = "MIT"

PV = "20230428"

RPM_NAME = "ruby-build-dependencies-truffleruby-20230428-1.1.noarch.rpm"
RPM_HASH = "6d5a586584aed80fa24b16c6ea829a6db670c75d69be44ea8c3072b6cff4fe5e701f06a56070bcfe46072b29d63168796aa014473c2cf9217f8e8e0c1be8280b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-truffleruby"
RDEPENDS:${PN} += "gcc openssl-devel"

inherit rpm
