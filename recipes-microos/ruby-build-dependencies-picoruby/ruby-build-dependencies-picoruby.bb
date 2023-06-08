SUMMARY = "Meta package for dependencies to build PicoRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build PicoRuby."
LICENSE = "MIT"

PV = "20230428"

RPM_NAME = "ruby-build-dependencies-picoruby-20230428-1.1.noarch.rpm"
RPM_HASH = "6e67f2df0864556df672b4250ba4fe4e11851219a9e67ecd595670fda900ec4a074d5b413d0573559502897ead1268c6a1abee64cd3213937af7e9afd8045f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-picoruby"
RDEPENDS:${PN} += "gcc git"

inherit rpm
