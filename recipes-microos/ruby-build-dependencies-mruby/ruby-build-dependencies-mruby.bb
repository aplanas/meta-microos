SUMMARY = "Meta package for dependencies to build mruby"
DESCRIPTION = "Meta package for ruby-build dependencies to build mruby."
LICENSE = "MIT"

PV = "20230428"

RPM_NAME = "ruby-build-dependencies-mruby-20230428-1.1.noarch.rpm"
RPM_HASH = "686939387731d0c3a498a3af0ff7da8ab03c5373c07a8d064b8da93490d020aed2d4e1a4c342fe062f3fa8d7facf23da27560594f00f272dfb4c7d9a33d2e001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-mruby"
RDEPENDS:${PN} += "gcc git"

inherit rpm
