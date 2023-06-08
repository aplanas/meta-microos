SUMMARY = "Meta package for dependencies to build JRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build JRuby."
LICENSE = "MIT"

PV = "20230428"

RPM_NAME = "ruby-build-dependencies-jruby-20230428-1.1.noarch.rpm"
RPM_HASH = "2589e7b48d447c7a9613d033ff8a14d08323538917c6dacc5820d18356b11ae3d7e2d8468d4f0f13836f7606db004f63796263cc4e524942a8dae697a70d4c70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-jruby"
RDEPENDS:${PN} += "gcc-c++"

inherit rpm
