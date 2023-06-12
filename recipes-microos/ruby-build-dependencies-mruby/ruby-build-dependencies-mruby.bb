SUMMARY = "Meta package for dependencies to build mruby"
DESCRIPTION = "Meta package for ruby-build dependencies to build mruby."
LICENSE = "MIT"

PV = "20230512"

RPM_NAME = "ruby-build-dependencies-mruby-20230512-1.1.noarch.rpm"
RPM_HASH = "2552d05710d10960597bb0473e12b3f8f8e55a31ec5f9b4fe58d89ba025e7fd556b2fc9f23444f855b4f2f0fb5cd0796c15342307696c9451759c73f490f4779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-mruby"
RDEPENDS:${PN} += "gcc \
git"

inherit rpm
